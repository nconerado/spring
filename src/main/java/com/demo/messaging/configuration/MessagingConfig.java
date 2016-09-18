package com.demo.messaging.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@Import({ActiveMQConfig.class, RabbitMQConfig.class})
public class MessagingConfig {

}
