package com.learn.jenkins.api;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsTestApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsTestApplicationTests.class);

	

	@Test
	void contextLoads() {
		logger.info("Test case execusting");
		assertEquals(true,true);
	}

}



