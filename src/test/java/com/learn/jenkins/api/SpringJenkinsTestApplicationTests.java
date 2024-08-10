package com.learn.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinsTestApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsTestApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case execusting");
		assertEquals(true,true);
		
	}

}




