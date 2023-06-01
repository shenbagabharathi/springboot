package com.example.demo4.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo4Controller {
	@GetMapping("/LandingPage")
public String shenba(@RequestParam String username) {
	return "hi my dear " +username;
}
}
