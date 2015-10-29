package com.springguild.users;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.*;
import org.springframework.data.jpa.repository.config.*;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
}
