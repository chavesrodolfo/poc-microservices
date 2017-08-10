package br.com.dodz.eurekaclienttwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientTwoApplication.class, args);
	}
}
