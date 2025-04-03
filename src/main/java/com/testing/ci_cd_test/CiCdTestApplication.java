package com.testing.ci_cd_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdTestApplication {

	@GetMapping("/api/v1/hello")
	public String SayWelcome(){
		return "Get Ready Go!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(CiCdTestApplication.class, args);
	}

}
