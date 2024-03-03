package com.microservices.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(ConsumerService.class);
	
	@KafkaListener(topics = "Input_Topic", groupId = "Input_Group")
	public void receiveMessageFromTopic(String receivedMessage) {
		LOGGER.info("The message received from topic is {}", receivedMessage);
	}

}
