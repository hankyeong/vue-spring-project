package com.vue.spring.service;

import java.util.List;

import com.vue.spring.model.Sports;

public interface SportsService {

	List<String> selectAllSports();

	String addSports(Sports sports);

}
