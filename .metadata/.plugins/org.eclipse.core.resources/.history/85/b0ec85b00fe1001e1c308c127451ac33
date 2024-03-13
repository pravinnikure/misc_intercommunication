package com.app.pravin.chartservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pravin.chartservice.bean.CartInfo;

@RestController
@RequestMapping("/cart")
public class ChartController {
	
	@Value("${server.port}")
	static String port;  

	@GetMapping("/message")
	public ResponseEntity<String> getCartMessage() {

		return ResponseEntity.ok("RESPONSE FROM CART-SERVICE "+ "App 2");
	}
	
	@GetMapping("/info/{id}")
	public ResponseEntity<CartInfo> getCartInfo(@PathVariable String id)
	{
		return ResponseEntity.ok(new CartInfo(id,1000.0));
		
		
	}
}
