package com.demo.messaging.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.demo.messaging.modal.ActiveMQMessaging;
import com.demo.messaging.modal.Messaging;

@Configuration
@Profile("qa")
public class ActiveMQConfig {	
	@Bean(name="activeMQBean")
	public Messaging getActiveMQBean(){		
		
		return new ActiveMQMessaging();
	}
	
	

}
