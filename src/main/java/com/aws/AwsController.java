package com.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {
	
	@GetMapping(value="/awsValue")
	public String get() {
		return "Hii";
	}

}
