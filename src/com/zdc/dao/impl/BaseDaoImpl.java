package com.zdc.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.zdc.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T> {
	public Class<T> clazz;

	private HibernateTemplate hibernateTemplate;

	@Override
	public void save(T entity) {
		hibernateTemplate.save(entity);
	}

	@Override
	public T load(int id) {
		return hibernateTemplate.load(clazz, id);
	}

	@Override
	public List<T> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource(name = "hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
