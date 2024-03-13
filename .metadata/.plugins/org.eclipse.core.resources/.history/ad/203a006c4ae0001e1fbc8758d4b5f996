package com.app.pravin.vendorservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class VendorService 
{
	@Autowired
	LoadBalancerClient client;
	RestTemplate rt = new RestTemplate();
	
	public String getData()
	{
		ServiceInstance si = client.choose("CART-SERVICE");
		
		String url = si.getUri()+"/cart/message";
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		
		return response.getBody();
	}

}
