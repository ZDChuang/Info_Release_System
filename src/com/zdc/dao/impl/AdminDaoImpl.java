package com.zdc.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.zdc.dao.AdminDao;
import com.zdc.model.Administrator;
import com.zdc.model.User;

@Component("adminDao")
public class AdminDaoImpl extends BaseDaoImpl<Administrator> implements AdminDao{
	
	private HibernateTemplate hibernateTemplate;
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean exists(Administrator admin) {
		List<Administrator> users = (List<Administrator>) hibernateTemplate.find
				("from Administrator admin where admin.name='"+admin.getName()+"'");
		if(users!=null && users.size()>0)
			return true;
		return false;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean isSuccess(Administrator admin) {
		List<Administrator> admins = (List<Administrator>) hibernateTemplate.find
				("from Administrator admin where admin.name='"+admin.getName()+"'");
		if(admins.isEmpty())
			return false;
		return admins.get(0).getPassword().equals(admin.getPassword());
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> userList() {
		return (List<User>) hibernateTemplate.find("from User");
	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(int id) {
		List<User> user = (List<User>) hibernateTemplate.find
				("from User u where u.id='"+ id +"'");
		if(user.isEmpty())
			return;
		this.hibernateTemplate.delete(user.get(0));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void change(int id) {
		List<User> user = (List<User>) hibernateTemplate.find
				("from User u where u.id='"+ id +"'");
		if(user.isEmpty())
			return;
		String authority = user.get(0).getAuthority();
		if(authority != null && authority.equals("Normal"))
				user.get(0).setAuthority("VIP");
		else
			user.get(0).setAuthority("Normal");
		hibernateTemplate.update(user.get(0));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void create(User u) {
		List<User> users = (List<User>) hibernateTemplate.find
				("from User u where u.name='"+ u.getName() +"'");
		if(!users.isEmpty())
			return;
		hibernateTemplate.save(u);
	}

	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource(name = "hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
