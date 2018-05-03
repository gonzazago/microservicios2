package com.gonza.zago.test.testmsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class TestMsBApplication {

	@RequestMapping("/")
	public String home() {
		return  "latitud:2,23234 longitud:45.3222 ";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestMsBApplication.class, args);
	}
}
