package com.cos.blog.test;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;

@RestController
public class BlogControllerTest {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/test/hello")
	public String hellow()
	{
		
		People p = new People();
		
		return "<h1>Hellow spring boot </h1>";
	}
	
	@PostMapping("/dummy/join")
	private String Join(User user) 
	{
		
		
		user.setRole(RoleType.USER);
		
		userRepository.save(user);
		
		System.out.println(user.toString());
		
		return "회원가입이 완료 되었습니다.";
	

	}
}
