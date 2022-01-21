package com.borba.springjms.listeners;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {
	
			
	@JmsListener(destination = "${springjms.myQueueSpring}")		
	public void receive(String message) {
		System.out.println("Message receive " + message);
	}

}
