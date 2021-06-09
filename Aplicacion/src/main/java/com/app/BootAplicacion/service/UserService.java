package com.app.BootAplicacion.service;

import javax.validation.Valid;

import com.app.BootAplicacion.entity.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();
	
	public User createUser(User user) throws Exception;

}
