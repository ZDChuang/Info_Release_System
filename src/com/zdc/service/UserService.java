package com.zdc.service;

import java.util.List;

import com.zdc.model.User;

public interface UserService {

	public abstract boolean exists(User u);

	public abstract void add(User u);

	public abstract List<User> userList();

	public abstract User load(int id);

	public abstract boolean isSuccess(User u);
}
