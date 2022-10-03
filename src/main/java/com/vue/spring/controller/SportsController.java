package com.vue.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vue.spring.model.Sports;
import com.vue.spring.service.SportsService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/hk")
@RestController
@Slf4j
public class SportsController {

	@Autowired
	SportsService sportsService;
	
	// 구독
	@GetMapping("/selectAllSports")
	@ResponseBody
	public Map<String, Object> selectAllSports() {
		List<String> success = sportsService.selectAllSports();
		log.info("success ==> {}", success);
		Map<String, Object> map = new HashMap<>();
		map.put("data", success);
		return map;
	}
	
	@PostMapping("/addSports")
	@ResponseBody
	public String addSports(@RequestBody Sports sports) {
		String sportsName = sportsService.addSports(sports);
		log.info("sportsName ==> {}", sportsName);
		return sportsName;
	}
	
	
}
