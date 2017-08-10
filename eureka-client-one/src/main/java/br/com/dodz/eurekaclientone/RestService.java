package br.com.dodz.eurekaclientone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestService {

	@Autowired
	private FeignClientTwo feignClientTwo;

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public ResponseEntity<String> sayHi() {
		return new ResponseEntity<>("Hi From Cliente One!", HttpStatus.OK);
	}

	@RequestMapping(value = "/hy", method = RequestMethod.GET)
	public ResponseEntity<String> sayHiUsingClientTwo() {
		return new ResponseEntity<>(feignClientTwo.sayHiByClientTwo() + " using Hystrix.", HttpStatus.OK);
	}

}
