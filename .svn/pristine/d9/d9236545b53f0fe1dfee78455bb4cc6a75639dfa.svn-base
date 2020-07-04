package com.company.jdbc.dao.idao;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.company.jdbc.dao.impl.ProductDao;
import com.company.jdbc.entity.Product;

public class IProductDaoTest {
	private IProductDao productDao;
	@Before
	public void setUp() throws Exception {
		productDao = new ProductDao();
	}

	@After
	public void tearDown() throws Exception {
		productDao = null;
	}

	@Test
	public void testInsert() {
	}

	@Test
	public void testDelete() {
	}

	@Test
	public void testUpdate() {
	}

	@Test
	public void testFindAll() throws Exception {
		List<Product> products = productDao.findAll();
		products.stream().forEach(System.err::println);
	}

	@Test
	public void testFindByPage() {
	}

	@Test
	public void testFindByName() {
	}

	@Test
	public void testFindById() {
	}

}
