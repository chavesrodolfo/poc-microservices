package br.com.dodz.eurekaclienttwo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestService {

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public ResponseEntity<String> sayHi() {
		return new ResponseEntity<>("Hi From Cliente Two!", HttpStatus.OK);
	}

}