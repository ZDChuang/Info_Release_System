package com.zdc.dao;

import java.util.List;

public interface BaseDao<T> {
	public void save(T entity);

	public List<T> list();

	public T load(int id);
}
