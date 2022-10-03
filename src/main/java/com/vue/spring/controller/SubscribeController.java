package com.vue.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vue.spring.model.SubscribeModel;
import com.vue.spring.service.SubscribeService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/hk")
@RestController
@Slf4j
public class SubscribeController {

	@Autowired
	SubscribeService subscribeService;
	
	// 구독
	@PostMapping("/exerciseSubscribe")
	@ResponseBody
	public Map<String, Object> subscribe(@RequestBody SubscribeModel sub) {
		String success = subscribeService.subscribe(sub);
		log.info("success ==> {}", success);
		Map<String, Object> map = new HashMap<>();
//		map.put("data", success);
		map.put("message", success);
		return map;
	}
	
	@PostMapping("/subscribeSelectAll")
	@ResponseBody
	public String subscribeSelectAll(@RequestBody SubscribeModel sub) {
		String sportsName = subscribeService.subscribeSelectAll(sub);
		log.info("sportsName ==> {}", sportsName);
		return sportsName;
	}
	
	
}
