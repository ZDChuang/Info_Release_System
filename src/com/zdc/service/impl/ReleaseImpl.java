package com.zdc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zdc.dao.NewsDao;
import com.zdc.model.News;
import com.zdc.service.Release;

@Component("release")
public class ReleaseImpl implements Release {

	private NewsDao newsDao;
	

	@Override
	public void saveNews(News news) {
		newsDao.createNews(news);
	}

	@Override
	public void deleteNews(int id) {
		newsDao.deleteNews(id);
	}

	@Override
	public void updateNews(News news) {
		newsDao.updateNews(news);
	}

	@Override
	public boolean isSuccess(News news) {
		return newsDao.isSuccess(news);
	}

	@Override
	public List<News> list() {
		return newsDao.list();
	}
	

	public NewsDao getNewsDao() {
		return newsDao;
	}
	
	@Resource(name="newsDao")
	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}
}
