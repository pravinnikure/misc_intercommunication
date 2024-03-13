package com.app.pravin.chartservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class ChartController {
	
	@Value("${server.port}")
	static String port;  

	@GetMapping("/message")
	public static String getCartMessage() {

		return "Hi From cart service "+ port;
	}

}
