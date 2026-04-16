package com.spring.Security.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WeatherReport {
	
	@GetMapping("/getWeatherReport")
	public ResponseEntity<String> getWeatherReport()
	{
		return ResponseEntity.ok("Very Hot Today 40'C");
		
	}

}
