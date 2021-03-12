package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mySrvllet {
@GetMapping("/")
	public String myHome() {
		return "home";
	}
}
