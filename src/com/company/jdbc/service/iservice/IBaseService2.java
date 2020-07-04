package com.company.jdbc.service.iservice;

import java.util.List;

import com.company.jdbc.common.Res;

@SuppressWarnings("rawtypes")
public interface IBaseService2<T,K> {
	//DML
	Res insert(T t);
	Res delete(T t);
	Res update(T t);
	//DQL
	Res<List<T>> findAll();
	Res<List<T>> findByPage(int page,int size);
	Res<List<T>> findByName(String name);
	Res<T> findById(K id);
}
