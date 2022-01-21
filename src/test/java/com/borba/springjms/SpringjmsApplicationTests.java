package com.borba.springjms;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.borba.springjms.senders.MessageSender;

@SpringBootTest
class SpringjmsApplicationTests {
	
	@Autowired
	MessageSender sender;

	@Test
	void contextLoads() {
		sender.send("Hello spring JMS!!");
	}
	
	

}
