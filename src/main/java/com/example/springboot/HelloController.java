package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	@ResponseBody
	public String sayHello(@RequestParam(name = "id",defaultValue = "amol") String name) {
		return "Greetings from " + name +" !";
	}

}