package com.audiro.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
public class AdminController {
	
	@GetMapping("/admin/admin_control")
	public void adminControl() {
		
	}
	
	@GetMapping("/admin/reports_management")
	public void adminReport() {
		
	}
	
	@GetMapping("/admin/members_management")
	public void adminMember() {
		
	}
	
	@GetMapping("/admin/resources_management")
	public void adminResource() {
		
	}
}
