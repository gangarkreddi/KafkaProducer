package com.praj.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerRC {
	
	@Autowired
	public KafkaProducerService kafkaProducerService;
	

	
	@PostMapping("/sendMessage")
	public void sendMessage(String message) {
		System.out.println("message"+message);
		kafkaProducerService.send(message);
		
	}
}
