package com.vue.spring.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.vue.spring.model.SubscribeModel;

@Mapper
public interface SubscribeMapper {

	int subscribe(SubscribeModel sub);

	SubscribeModel subscribeChk(SubscribeModel sub);

	int subscribeUpdate(SubscribeModel sub);

	String subscribeSelectAll(SubscribeModel sub);
}
