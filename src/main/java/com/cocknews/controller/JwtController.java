package com.cocknews.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cocknews.dto.UserLoginDto;
import com.cocknews.service.CustomUserDetailsService;

@CrossOrigin("http://localhost:4200")
@RestController
public class JwtController {

	@Autowired
	private  CustomUserDetailsService customUserDetailsService;
	
	@PostMapping("/auth/login")
	public String createJwtToken(@RequestBody UserLoginDto loginDto) throws Exception
	{
		return customUserDetailsService.createJwtToken(loginDto);
		
	}
}
