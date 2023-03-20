package com.example.demosecurity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class securecontroller {

	@RequestMapping("/secure")
	
	public String display(@AuthenticationPrincipal final UserDetails Userdetails)
	{
		
		String username=Userdetails.getUsername();
		
		Collection<? extends GrantedAuthority> authorities =Userdetails.getAuthorities();
		
		authorities.forEach(System.out::println);
		
		return"hii this a return statement";
	}
	
/*	@RequestMapping("/Ab")
	
	public String display()
	{
		return"this is secure";
	}*/

}  