package com.vue.spring.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
	
	private long id;
	private String userId;
	private String userPwd;
	private String userAddress;
	private int userAge;
	private Date createTime;
	private Date updateTime;
}
