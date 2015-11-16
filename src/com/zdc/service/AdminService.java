package com.zdc.service;

import java.util.List;

import com.zdc.model.Administrator;
import com.zdc.model.User;

public interface AdminService {

	boolean exists(Administrator admin);

	void add(Administrator admin);

	boolean isSuccess(Administrator admin);
	
	List<User> list();

	void delete(int id);

	void change(int id);

	void create(User u);
}
