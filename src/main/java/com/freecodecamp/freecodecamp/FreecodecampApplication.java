package com.freecodecamp.freecodecamp;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FreecodecampApplication {

	private static final Logger log=LoggerFactory.getLogger(FreecodecampApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FreecodecampApplication.class, args);
		log.info("ABUZAR gkok12");
	}

}
