package com.zdc.dao;

import java.util.List;

import com.zdc.model.News;

public interface NewsDao {
	public void createNews(News news);
	public void deleteNews(int id);
	public void updateNews(News news);
	public News queryNews(int id);
	public List<News> getNewsByType(int id);
	public boolean isSuccess(News news);
	public List<News> list();
	
}
