package com.shop.service;

import java.util.List;

import com.shop.domain.User;

public interface UserService {
	List<User> findAllUsers();

	User findUserById(Long id);

	User updateUser(User user);

	User insertUser(User user);

	void deleteUserById(Long id);
}
