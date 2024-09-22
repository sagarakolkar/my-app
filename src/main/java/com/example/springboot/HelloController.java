package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	@ResponseBody
	public String sayHello(@RequestParam(name = "name",defaultValue = "Sagar") String name) {
		return "Greetings from " + name +"! How are you ?";
	}
}