package com.zdc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zdc.dao.AdminDao;
import com.zdc.model.Administrator;
import com.zdc.model.User;
import com.zdc.service.AdminService;

@Component("adminService")
public class AdminServiceImpl implements AdminService{

	private AdminDao adminDao;
	
	@Override
	public void create(User u) {
		adminDao.create(u);
	}
	
	@Override
	public List<User> list() {
		return adminDao.userList();
	}
	
	@Override
	public void delete(int id) {
		adminDao.delete(id);
	}

	@Override
	public void add(Administrator admin) {
		adminDao.save(admin);
	}
	
	@Override
	public boolean exists(Administrator admin) {
		return adminDao.exists(admin);
	}
	
	@Override
	public boolean isSuccess(Administrator admin) {
		return adminDao.isSuccess(admin);
	}
	
	@Override
	public void change(int id) {
		adminDao.change(id);
	}

	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	@Resource(name="adminDao")
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

}
