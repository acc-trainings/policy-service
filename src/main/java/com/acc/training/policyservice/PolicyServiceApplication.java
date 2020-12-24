package com.acc.training.policyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PolicyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolicyServiceApplication.class, args);
		// SpringApplication springApplication = new
		// SpringApplication(PolicyServiceApplication.class);
		// SimpleCommandLinePropertySource source = new
		// SimpleCommandLinePropertySource(args);
		// if (!source.containsProperty("spring.profiles.active")
		// && !System.getenv().containsKey("SPRING_PROFILES_ACTIVE")) {

		// springApplication.setAdditionalProfiles("local");
		// }
	}

}
