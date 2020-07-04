package com.company.jdbc.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.company.jdbc.dao.idao.IProductDao;
import com.company.jdbc.entity.Product;
import com.company.jdbc.util.DBUtils;

public class ProductDao implements IProductDao {

	@Override
	public int insert(Product t) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Product t) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Product t) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> findAll() throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select pid,pname,price,pdate from product";
		List<Product> products = qr.query(sql, new BeanListHandler<Product>(Product.class));
		return products;
	}

	@Override
	public List<Product> findByPage(int page, int size) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
