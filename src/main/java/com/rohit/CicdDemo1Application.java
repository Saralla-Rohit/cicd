package com.rohit;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class CicdDemo1Application {
	
//	public static Logger logger=org.slf4j.LoggerFactory.getLogger(CicdDemo1Application.class);
	@PostConstruct
	public void intt() {
		logger.info("Application started");
	}
	public static void main(String[] args) {
		logger.info("Application executed");
		SpringApplication.run(CicdDemo1Application.class, args);
	}

}
