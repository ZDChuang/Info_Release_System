package com.zdc.dao;

import java.util.List;

import com.zdc.model.Administrator;
import com.zdc.model.User;

public interface AdminDao extends BaseDao<Administrator>{
	boolean exists(Administrator admin);

	boolean isSuccess(Administrator admin);

	List<User> userList();

	void delete(int id);

	void change(int id);

	void create(User u);
}
