package com.vue.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.vue.spring.model.User;

@Mapper
public interface UserMapper {

	int memberCreate(User user);

	int memberUpdate(User user);

	int memberDelete(User user);

	User memberSelect(String userId);

	List<User> memberSelectAll();

	User memberlogin(User user);

	

}
