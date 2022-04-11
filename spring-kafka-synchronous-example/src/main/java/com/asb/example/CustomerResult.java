package com.asb.example;

//import java.util.concurrent.ThreadLocalRandom;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class CustomerResult {

	@KafkaListener(topics = "${kafka.reuest.topic}", groupId = "${kafka.group.id}")
	@SendTo
	public Result handle(Customer customer) {

		// simulate api call
		System.out.println("Calculating Result...");
		Result result = new Result();
		result.setRcustomerName(customer.getCustomerName());
		result.setRidNo(customer.getIdNo());
		result.setRstatus("Accept");
		result.setRdatereceived("11/04/2022");
		return result;
	}
}