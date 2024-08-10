package com.learn.jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsTestApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsTestApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application Started");
	}

	public static void main(String[] args) {
		logger.info("Application Excuted");
		SpringApplication.run(SpringJenkinsTestApplication.class, args);
	}

}
