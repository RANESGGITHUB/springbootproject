package com.spring.Security.util;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JWTUtil {

	private static final long EXPRIATION_DATE = 1000 * 60 * 60;
	private static final String SECRET = "my-key-for-testing-the-appliation-@123456789";
	private static final SecretKey KEY = Keys.hmacShaKeyFor(SECRET.getBytes());

	public String getJWToken(String userName) {

		return Jwts.builder().setSubject(userName).setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + EXPRIATION_DATE))
				.signWith(KEY, SignatureAlgorithm.HS256).compact();

	}

}
