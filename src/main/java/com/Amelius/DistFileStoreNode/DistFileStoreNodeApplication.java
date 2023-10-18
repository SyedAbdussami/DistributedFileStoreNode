package com.Amelius.DistFileStoreNode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DistFileStoreNodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistFileStoreNodeApplication.class, args);
	}

}
