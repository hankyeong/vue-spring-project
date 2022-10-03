package com.vue.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.vue.spring.mapper.SportsMapper;
import com.vue.spring.model.Sports;
import com.vue.spring.model.SubscribeModel;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SportsServiceImpl implements SportsService {

	@Autowired
	private SportsMapper sportsMapper;
	
	@Override
	public List<String> selectAllSports() {
		return sportsMapper.selectAllSports();
	}

	@Override
	public String addSports(Sports sports) {
		// 조회
		Sports sportsChk = sportsMapper.sportsChk(sports);
		if(ObjectUtils.isEmpty(sportsChk)) {
			int result = sportsMapper.addSports(sports);
			if(result > 0) {
				return "스포츠 등록 성공";
			}else {
				return "스포츠 등록 실패";
			}
		}else {
			return "이미 존재하는 스포츠 입니다.";
		}
	}

}
