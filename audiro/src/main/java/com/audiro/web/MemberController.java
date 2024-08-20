package com.audiro.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member")
@Controller
public class MemberController {
	
	@GetMapping("/signup")
	public void signup() {
		
	}
	
	@GetMapping("/signin")
	public void signin() {
		
	}
	
	@GetMapping("/find-username")
	public void findUsername() {
		
	}
	
	@GetMapping("/find-password")
	public void findPassword() {
		
	}
}
