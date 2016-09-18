package com.demo.hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/* asolanki */
@Configuration
public class Config {
	@Bean(name="helloWorldBean")
	public HelloWorld helloWorld(){
			return new HelloWorldImpl();
		}
	}

