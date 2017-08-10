package br.com.dodz.eurekaclientone;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "client-two")
public interface FeignClientTwo {

	@RequestMapping(value = "/api/hi", method = RequestMethod.GET)
	String sayHiByClientTwo();
}
