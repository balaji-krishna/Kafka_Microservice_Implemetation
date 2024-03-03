package com.microservices.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.kafka.service.ProducerService;

@RestController
@RequestMapping(path = "/kafkaApi")
public class KafkaController {

	@Autowired
	private ProducerService producerService;

	@GetMapping("getKafkaMsgFromClient")
	public void getKafkaMsgFromClient(@RequestParam("INPUT") String inputMessage) {
		producerService.sendMessageToTopic(inputMessage);
	}

}
