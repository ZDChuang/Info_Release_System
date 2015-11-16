package com.zdc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zdc.dao.UserDao;
import com.zdc.model.User;
import com.zdc.service.UserService;

@Component("userService")
public class UserServiceImpl implements UserService{

	private UserDao userDao;

	@Override
	public void add(User u) {
		userDao.save(u);
	}
	
	@Override
	public boolean exists(User u) {
		return userDao.exists(u);
	}
	
	@Override
	public List<User> userList() {
		return this.userDao.list();
	}

	@Override
	public User load(int id) {
		return this.userDao.load(id);
	}
	
	@Override
	public boolean isSuccess(User u) {
		return userDao.isSuccess(u);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	@Resource(name="userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
