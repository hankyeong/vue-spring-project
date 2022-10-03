package com.vue.spring.service;

import java.util.List;

import com.vue.spring.model.User;

public interface UserService {

	String memberCreate(User user);

	String memberUpdate(User user);

	String memberDelete(User user);

	User memberSelect(String userId);

	List<User> memberSelectAll();

	User memberlogin(User user);

}
