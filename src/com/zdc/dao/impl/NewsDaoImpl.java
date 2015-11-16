package com.zdc.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.zdc.dao.NewsDao;
import com.zdc.model.News;

@Component("newsDao")
public class NewsDaoImpl implements NewsDao{

	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void createNews(News news) {
		this.hibernateTemplate.save(news);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void deleteNews(int id) {
		List<News> news = (List<News>) this.hibernateTemplate.find
				("from News where id="+ id);
		if(news.isEmpty())
			return;
		this.hibernateTemplate.delete(news.get(0));
	}

	@Override
	public void updateNews(News news) {
//		List<News> news = (List<News>) this.hibernateTemplate.find("from News where id="+ id);
//		if(news.isEmpty())
//			return;
		this.hibernateTemplate.update(news);
	}

	@SuppressWarnings("unchecked")
	@Override
	public News queryNews(int id) {
		List<News> news = (List<News>) this.hibernateTemplate.find("from News where id="+ id);
		if(news.isEmpty())
			return null;
		return news.get(0);
	}

	@Override
	public List<News> getNewsByType(int id) {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean isSuccess(News news) {
		List<News> newss = (List<News>) this.hibernateTemplate.find
		("from News where head='"+ news.getHead() +"'");
		if(newss.isEmpty())
			return true;
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<News> list() {
		return (List<News>) this.hibernateTemplate.find("from News");
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
