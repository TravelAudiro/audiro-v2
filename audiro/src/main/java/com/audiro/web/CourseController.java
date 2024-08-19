package com.audiro.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("course")
public class CourseController {

	@GetMapping("/details")
	public void details() {

	}
	
	  @GetMapping("/create")
	    public void create() {
	 
	    }

}