package com.vue.spring.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.vue.spring.mapper.UserMapper;
import com.vue.spring.model.User;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public String memberCreate(User user) {
		User userChk = userMapper.memberSelect(user.getUserId());
		if(ObjectUtils.isEmpty(userChk)) {
			userMapper.memberCreate(user);
			return "가입성공";
		}else {
			return "이미 가입한 고객입니다.";
		}
	}

	@Override
	public String memberUpdate(User user) {
		int resultCnt = userMapper.memberUpdate(user);
		if(resultCnt > 0) {
			return "수정성공";
		}
		return "수정실패";
	}

	@Override
	public String memberDelete(User user) {
		if(userMapper.memberDelete(user) > 0) {
			return "삭제성공";
		}
		return "삭제실패";
	}

	@Override
	public User memberSelect(String userId) {
		User user = userMapper.memberSelect(userId);
		log.info("user select service => {}", user);
		return user;
	}

	@Override
	public List<User> memberSelectAll() {
		List<User> userList = userMapper.memberSelectAll();
		
//		for(int i = 0; i< userList.size(); i++) {
//			log.info("[For] {}번째 실행 => {}", i, userList.get(i));
//		}
//		
//		int cnt = 0;
//		for (User user : userList) {
//			log.info("[Foreach] {}번째 실행 => {}",cnt++, user);
//		}
//		
//		List<User> filterUserList = userList.stream().filter(뿡뿡 -> !뿡뿡.getUserId().contains("wn")).collect(Collectors.toList());
//		int cnt2 = 0;
//		for (User user : filterUserList) {
//			log.info("[Filter] {}번째 실행 => {}",cnt2++, user);
//		}
		
		return userList;
	}

	@Override
	public User memberlogin(User user) {
		User loginUser = userMapper.memberlogin(user);
		return loginUser;
	}

}
