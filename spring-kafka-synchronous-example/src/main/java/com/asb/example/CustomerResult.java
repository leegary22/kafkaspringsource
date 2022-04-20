package com.asb.example;

//import java.util.concurrent.ThreadLocalRandom;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Component
public class CustomerResult {

	@KafkaListener(topics = "${kafka.reuest.topic}", groupId = "${kafka.group.id}")
	@SendTo
	public Result handle(Customer customer) {

		// simulate api call
		final String urlamla = "https://my.api.mockaroo.com/ResponseAML.json";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("X-API-Key", "0c1c81c0");

        Map<String, Object> map = new HashMap<>();
        map.put("name", "jenny");
        map.put("idNo", "1111111");

        // build the request
        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, headers);

        // send POST request
        //ResponseEntity<String> response = restTemplate.postForEntity(urlamla, entity, String.class);
        Result response = restTemplate.postForObject(urlamla, entity, Result.class);

        // System.out.println(response.getCustomerName());

		 System.out.println("Calculating Result...");
		 Result result = new Result();
		 result.setCustomerName(response.getCustomerName());
         result.setIdNo(response.getIdNo());
         result.setStatus(response.getStatus());
         result.setDateReceived(response.getDateReceived());
         return result;
      }
}