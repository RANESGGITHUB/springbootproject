package com.spring.Security.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.spring.Security.entity.Users;
import com.spring.Security.repository.UserDetailsRepository;

@Component
public class UserCommandLineRunner implements CommandLineRunner{
	
	private UserDetailsRepository userDetailsRepository;
	
	private PasswordEncoder passwordEncoder;
	
	public UserCommandLineRunner(UserDetailsRepository userDetailsRepository,PasswordEncoder passwordEncoder)
	{
		this.userDetailsRepository=userDetailsRepository;
		this.passwordEncoder=passwordEncoder;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Users users=new Users();
		users.setUserName("rragolu");
		
		users.setPassword(passwordEncoder.encode("rragolu@123"));
		
		users.setRole("ADMIN_USER");
		
		users=userDetailsRepository.save(users);
		
	   System.out.print("user object saved " + users);
		
		
	}

}
