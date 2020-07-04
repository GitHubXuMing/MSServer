package com.company.jdbc.service.impl;

import java.util.List;

import com.company.jdbc.dao.factory.DaoFactory;
import com.company.jdbc.dao.idao.IProductDao;
import com.company.jdbc.entity.Product;
import com.company.jdbc.service.iservice.IProductService;

public class ProductService implements IProductService {

	private IProductDao productDao;

	public ProductService() {
		productDao = DaoFactory.getProductDaoInstance();
	}

	@Override
	public String insert(Product t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Product t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Product t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		List<Product> result = null;
		try {
			result = productDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Product> findByPage(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
