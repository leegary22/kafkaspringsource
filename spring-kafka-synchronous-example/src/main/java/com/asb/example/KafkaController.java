package com.asb.example;

import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.requestreply.ReplyingKafkaTemplate;
import org.springframework.kafka.requestreply.RequestReplyFuture;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

	@Value("${kafka.reuest.topic}")
	private String requestTopic;

	@Autowired
	private ReplyingKafkaTemplate<String, Customer, Result> replyingKafkaTemplate;

	@PostMapping("/get-result")
	public ResponseEntity<Result> getObject(@RequestBody Customer customer)
			throws InterruptedException, ExecutionException {
		ProducerRecord<String, Customer> record = new ProducerRecord<>(requestTopic, null, customer.getIdNo(), customer);
		RequestReplyFuture<String, Customer, Result> future = replyingKafkaTemplate.sendAndReceive(record);
		ConsumerRecord<String, Result> response = future.get();
		return new ResponseEntity<>(response.value(), HttpStatus.OK);
	}
}