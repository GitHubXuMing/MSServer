package com.company.jdbc.dao.idao;

import java.util.List;

public interface IBaseDao<T,K> {
	//DML
	public int insert(T t) throws Exception;
	public int delete(T t) throws Exception;
	public int update(T t) throws Exception;
	//DQL
	public List<T> findAll() throws Exception;
	public List<T> findByPage(int page,int size) throws Exception;
	public List<T> findByName(String name) throws Exception;
	public T findById(K id) throws Exception;
}
