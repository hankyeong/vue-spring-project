package com.vue.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vue.spring.model.User;
import com.vue.spring.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/hk")
@RestController
@Slf4j
public class UserController {

	@Autowired
	UserService userService;
	
	// 전체조회
	@GetMapping("/memberSelectAll")
	@ResponseBody
	public Map<String, Object> memberSelectAll() {
		List<User> userAll = userService.memberSelectAll();
		log.info("userAll ==> {}", userAll);
		Map<String, Object> map = new HashMap<>();
		map.put("data", userAll);
		map.put("message", "전체 불러오기 성공");
		return map;
	}
	// 단일조회
	@GetMapping("/memberSelect")
	@ResponseBody
	public User memberSelect(@RequestParam("userId") String userId) {
		log.info("userId => {}", userId);
		return userService.memberSelect(userId);
	}
	
	// 가입
	@PostMapping("/memberCreate")
	@ResponseBody
	public String memberCreate(@RequestBody User user) {
		log.info("user => {}", user);
		return userService.memberCreate(user);
	}
	
	// 수정
	@PostMapping("/meberUpdate")
	public String meberUpdate(@RequestBody User user) {
		return userService.memberUpdate(user);
	}
	
	// 삭제
	@PostMapping("/memberDelete")
	public String memberDelete(@RequestBody User user) {
		return userService.memberDelete(user);
	}
}
