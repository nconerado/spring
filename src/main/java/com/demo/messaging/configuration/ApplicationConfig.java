package com.demo.messaging.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.demo.messaging.modal.ActiveMQMessaging;
import com.demo.messaging.modal.RabbitMQMessaging;

public class ApplicationConfig {
	public static void main(String[] args){
		ApplicationContext context = SpringApplication.run(MessagingConfig.class);
		
		ActiveMQMessaging activeMqMessaging = (ActiveMQMessaging)context.getBean("activeMQBean");
		
		
		activeMqMessaging.sendMessage();
		
		
		RabbitMQMessaging rabbitMqMessaging = (RabbitMQMessaging) context.getBean("rabbitMQBean");
		rabbitMqMessaging.sendMessage();
		
	}

}
