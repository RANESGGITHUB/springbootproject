package com.spring.Security.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Security.dto.UsersDto;
import com.spring.Security.service.UserManagementService;

@RestController
@RequestMapping("/api")
public class UserManagementResource {
	
	@Autowired
	private UserManagementService userManagementService;
	
	@PostMapping("/createuser")
	public ResponseEntity<UsersDto> createUser(@RequestBody UsersDto usersDto)
	{
		 usersDto=userManagementService.createUser(usersDto);
		 return ResponseEntity.ok().body(usersDto);
	}

}
