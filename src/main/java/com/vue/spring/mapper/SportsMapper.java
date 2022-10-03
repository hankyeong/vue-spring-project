package com.vue.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.vue.spring.model.Sports;
import com.vue.spring.model.SubscribeModel;

@Mapper
public interface SportsMapper {

	List<String> selectAllSports();

	Sports sportsChk(Sports sports);

	int addSports(Sports sports);
}
