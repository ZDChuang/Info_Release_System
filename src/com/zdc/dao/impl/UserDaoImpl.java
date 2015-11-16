package com.zdc.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.zdc.dao.UserDao;
import com.zdc.model.User;

@Component("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
	
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void save(User u) {
		hibernateTemplate.save(u);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean exists(User u) {
		List<User> users = (List<User>) hibernateTemplate.find
				("from User u where u.name='"+u.getName()+"'");
		if(users!=null && users.size()>0)
			return true;
		return false;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean isSuccess(User u) {
		List<User> user = (List<User>) hibernateTemplate.find
				("from User u where u.name='"+u.getName()+"'");
		if(user.isEmpty())
			return false;
		return user.get(0).getPassword().equals(u.getPassword());
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource(name = "hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
