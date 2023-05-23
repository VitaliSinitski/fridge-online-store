package com.vitali;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Slf4j
@EnableAspectJAutoProxy
@SpringBootApplication
public class FridgeOnlineStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FridgeOnlineStoreApplication.class, args);
		log.info("app-started");
	}

}
