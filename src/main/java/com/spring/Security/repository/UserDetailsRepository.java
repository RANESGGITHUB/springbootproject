package com.spring.Security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Security.entity.Users;

@Repository
public interface UserDetailsRepository extends JpaRepository<Users, Long>{
	
	Optional<Users> findByUserName(String userName);

}
