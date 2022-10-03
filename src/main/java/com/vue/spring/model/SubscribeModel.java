package com.vue.spring.model;

import java.util.Date;

import lombok.Data;

@Data
public class SubscribeModel {

	private String id;
	private String userKey;
	private String sportsName;
	private String subscribeCnt;
	private String automaticPaymentYn;
	private Date createTime;
	private Date updateTime;
	private Date expiryTime;
	
}
