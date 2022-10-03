package com.vue.spring.model;

import java.util.Date;

import lombok.Data;

@Data
public class Sports {

	private String id;
	private String sportsName;
	private Date createTime;
	private Date updateTime;
	
}
