package com.borba.springjms.senders;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderOthers {

	@Autowired	
	private JmsTemplate jmsTemplate;
	
	@Value("${springjms.myQueueSpring}")
	private String queue;
	
	public void send(String message) {
		
		/**
		 * receive message or user creator
		 */
		MessageCreator mc = s -> s.createTextMessage("hello spring!!");
		
		/**
		 * use pub/sub/ topics
		 */
		jmsTemplate.setPubSubDomain(true);
		
		jmsTemplate.convertAndSend(queue, mc);
	}
	

}
