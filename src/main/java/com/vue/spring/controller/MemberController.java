package com.vue.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vue.spring.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/memo")
@RestController
@Slf4j
public class MemberController {
	
	@Autowired
	private MemberService memberService;

	/**
	 * 메모 등록
	 * 로그인 세션체크 필수!
	 * @param httpSession
	 * @return
	 */
	@GetMapping("/createMemo")
	public String createMemo(HttpSession httpSession){
		
		return "createMemo";
	}
	
	/**
	 * 메모 변경
	 * 로그인 세션체크 필수!
	 * @param httpSession
	 * @return
	 */
	@PostMapping("/modifyMemo")
    public String modifyMemo(HttpSession httpSession){

        return "modifyMemo";
    }
	
	/**
	 * 메모 삭제
	 * 로그인 세션체크 필수!
	 * @param httpSession
	 * @return
	 */
	@PostMapping("/deleteMemo")
    public String deleteMemo(HttpSession httpSession){

        return "deleteMemo";
    }
	
	/**
	 * 메모 조회
	 * @param httpSession
	 * @return
	 */
	@PostMapping("/selectMemo")
	@ResponseBody
    public String selectMemo(@RequestBody Map<String, Object> param){
		log.info("들어오나요? ==> {}", param.get("memoNo"));
//		String reuslt = memberService.selectMemo(param.get("memoNo").toString());

//        return "/memo/select/index"; // 페이지 url 입력
		return (String) param.get("memoNo"); // DB 연동 확인
    }
	
}
