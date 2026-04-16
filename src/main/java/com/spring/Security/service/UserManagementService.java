package com.spring.Security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.Security.dto.UsersDto;
import com.spring.Security.entity.Users;
import com.spring.Security.mapper.UserMapping;
import com.spring.Security.repository.UserDetailsRepository;

@Service
public class UserManagementService {
		
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	public UsersDto createUser(UsersDto usersDto)
	{
		UserMapping userMapping=new UserMapping();
		
		Users users=userMapping.mapToDTOtoEntity(usersDto);
		users.setPassword(passwordEncoder.encode(usersDto.getPassword()));
				
		users=userDetailsRepository.save(users);
		
		return usersDto=userMapping.mapToEntityToDTO(users);
	}
	
	
	

}
