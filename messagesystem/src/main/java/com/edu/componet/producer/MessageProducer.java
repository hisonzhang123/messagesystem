package com.edu.componet.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edu.componet.config.MessageProducerConfig;

@Component
public class MessageProducer {
	@Autowired
	private MessageProducerConfig messageProducerConfig;

	public void sayHelloProducer() throws Exception {
		System.out.println(messageProducerConfig.getName() + ":say Hello Producer !!!!");
	}
}
