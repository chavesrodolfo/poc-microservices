package br.com.dodz.eurekaclientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientOneApplication.class, args);
	}
}
