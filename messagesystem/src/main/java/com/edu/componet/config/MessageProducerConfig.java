package com.edu.componet.config;

import org.springframework.stereotype.Component;

@Component
public class MessageProducerConfig {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
