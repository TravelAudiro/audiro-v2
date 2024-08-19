package com.audiro.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
public class AdminController {
	
	@GetMapping("/admin/admin_control")
	public void adminControl() {
		
	}
	
	@GetMapping("/admin/report_management")
	public void adminReport() {
		
	}
	
	@GetMapping("/admin/member_management")
	public void adminMember() {
		
	}
	
	@GetMapping("/admin/resource_management")
	public void adminResource() {
		
	}
}
