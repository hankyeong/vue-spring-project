package com.vue.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vue.spring.model.User;
import com.vue.spring.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/hk")
@RestController
@Slf4j
public class LoginController {
	
	@Autowired
	UserService userService;
	
	// 단일조회
	@PostMapping("/login")
	@ResponseBody
	public User memberlogin(@RequestBody User user) {
		log.info("user => {}", user);
		return userService.memberlogin(user);
	}
}
