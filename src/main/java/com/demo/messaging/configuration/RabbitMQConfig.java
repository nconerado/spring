package com.demo.messaging.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.demo.messaging.modal.Messaging;
import com.demo.messaging.modal.RabbitMQMessaging;

@Configuration
@Profile("dev")
public class RabbitMQConfig {
	@Bean(name="rabbitMQBean")	
	public Messaging getRabbitMQBean(){
		return new RabbitMQMessaging();
	}
}
