package com.company.jdbc.dao;


import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import com.company.jdbc.dao.idao.IEmpDao;
import com.company.jdbc.dao.impl.EmpDao;
import com.company.jdbc.entity.Emp;

import junit.framework.TestCase;

public class EmpDaoTest {
	
	private IEmpDao empDao = new EmpDao();

	@Test
	public void testFindAll() throws Exception {
		empDao.findAll().stream().forEach(System.out::println);
	}

	@Test
	public void testFindByPage() throws Exception {
		empDao.findByPage(2,3).stream().forEach(System.out::println);
	}

	@Test
	public void testFindByName() throws Exception {
		empDao.findByName("h").stream().forEach(System.out::println);
	}

	@Test
	public void testFindById() throws Exception {
		System.out.println(empDao.findById(3));
		System.out.println(empDao.findById(99));
		TestCase.assertNotNull(empDao.findById(3));
		TestCase.assertNull(empDao.findById(99));
	}

	@Test
	public void testInsert() throws Exception {
		Emp emp = new Emp("junit-aaa","job-aaa",1,new Date(),new BigDecimal("1.23"),new BigDecimal("2.34"),2);
		TestCase.assertEquals(1, empDao.insert(emp));
	}

	@Test
	public void testDelete() throws Exception {
		Emp emp = new Emp();
		emp.setEmpno(16);
		System.out.println(empDao.delete(emp));
	}

	@Test
	public void testUpdate() throws Exception {
		Emp emp = empDao.findById(15);
		emp.setEname("test_UPDATE");
		emp.setMgr(6);
		empDao.update(emp);
	}

}
