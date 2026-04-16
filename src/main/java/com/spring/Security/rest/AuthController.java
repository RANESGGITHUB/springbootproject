package com.spring.Security.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Security.dto.AuthDto;
import com.spring.Security.util.JWTUtil;

@RestController
@RequestMapping("/api")
public class AuthController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JWTUtil jWTUtil;

	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthDto authDto) {

		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authDto.getUserName(), authDto.getPassword()));
			// HERE WE NEED TO CREATE A JWT TOKEN AFTER authenticate Success

			return jWTUtil.getJWToken(authDto.getUserName());
		}

		catch (AuthenticationException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "jwt token";

	}

}
