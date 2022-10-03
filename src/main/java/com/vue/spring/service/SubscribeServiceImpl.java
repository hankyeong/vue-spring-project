package com.vue.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.vue.spring.mapper.SubscribeMapper;
import com.vue.spring.model.SubscribeModel;
import com.vue.spring.model.User;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SubscribeServiceImpl implements SubscribeService {

	@Autowired
	private SubscribeMapper subscribeMapper;
	
	@Override
	public String subscribe(SubscribeModel sub) {
		
		// 조회
		SubscribeModel subChk = subscribeMapper.subscribeChk(sub);
		if(ObjectUtils.isEmpty(subChk)) {
			int result = subscribeMapper.subscribe(sub);
			if(result > 0) {
				return "구독성공";
			}
		}else {
			int result = subscribeMapper.subscribeUpdate(sub);
			if(result > 0) {
				return "구독성공";
			}
		}
		
		return "구독실패";
	}

	@Override
	public String subscribeSelectAll(SubscribeModel sub) {
		return subscribeMapper.subscribeSelectAll(sub);
	}

}
