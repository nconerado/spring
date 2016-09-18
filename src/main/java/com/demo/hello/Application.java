package com.demo.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class Application {
	public static void main(String[] args){
		ApplicationContext context = SpringApplication.run(Config.class);
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorldBean");
		helloWorld.sayHello("Arpan");				
	}

}
