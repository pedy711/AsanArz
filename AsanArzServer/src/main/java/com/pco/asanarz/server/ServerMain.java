package com.pco.asanarz.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="com.pco.asanarz")
public class ServerMain {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServerMain.class, args);
	}
}


