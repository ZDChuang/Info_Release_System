package com.zdc.service;

import java.util.List;

import com.zdc.model.News;

public interface Release {
	public void saveNews(News news);
	public void deleteNews(int id);
	public void updateNews(News news);
	public boolean isSuccess(News news);
	public List<News> list();

}
