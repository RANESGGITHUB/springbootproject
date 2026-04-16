package com.spring.Security.mapper;

import com.spring.Security.dto.UsersDto;
import com.spring.Security.entity.Users;
public class UserMapping {
	
	
	public Users mapToDTOtoEntity(UsersDto usersDto)
	{
		Users users=new Users();
		users.setId(usersDto.getId());
		users.setPassword(usersDto.getPassword());
		users.setUserName(usersDto.getPassword());
		users.setRole(usersDto.getRole());
		return users;
		
	}
	public UsersDto mapToEntityToDTO(Users users)
	{
		UsersDto usersDto=new UsersDto();
		usersDto.setId(users.getId());
		usersDto.setPassword(users.getPassword());
		usersDto.setUserName(users.getPassword());
		usersDto.setRole(users.getRole());
		return usersDto;
		
	}

}
