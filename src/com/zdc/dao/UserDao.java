package com.zdc.dao;

import com.zdc.model.User;

public interface UserDao extends BaseDao<User>{
	boolean exists(User u);

	boolean isSuccess(User u);
}
