package com.edu.ws;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/extJs")
public class ExtJsController {

	@RequestMapping(value="test",method = RequestMethod.GET)
	public ResponseEntity<String> testExtJs() {
		return new ResponseEntity<String>("ExtJsDemo", HttpStatus.OK);
	}
	
	public void test(){
		
	}
}
