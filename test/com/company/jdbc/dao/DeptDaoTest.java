package com.company.jdbc.dao;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import com.company.jdbc.dao.idao.IDeptDao;
import com.company.jdbc.dao.impl.DeptDao;
import com.company.jdbc.entity.Dept;

import junit.framework.TestCase;

public class DeptDaoTest {
	
	private IDeptDao deptDao = new DeptDao();

	@Test
	public void testFindAll() throws Exception {
		deptDao.findAll().stream().forEach(System.out::println);
	}

	@Test
	public void testFindByPage() throws Exception {
		deptDao.findByPage(2,3).stream().forEach(System.out::println);
	}

	@Test
	public void testFindByName() throws Exception {
		deptDao.findByName("a").stream().forEach(System.out::println);
	}

	@Test
	public void testFindById() throws Exception {
		System.out.println(deptDao.findById(3));
		System.out.println(deptDao.findById(99));

	}

	@Test
	public void testInsert() throws Exception {
		Dept dept = new Dept("test-AA","test-aa");
		TestCase.assertEquals(1, deptDao.insert(dept));
	}

	@Test
	public void testDelete() throws Exception {
		Dept dept = new Dept();
		dept.setDeptno(3);
		System.out.println(deptDao.delete(dept));
	}

	@Test
	public void testUpdate() throws Exception {
		Dept dept = deptDao.findById(1003);
		dept.setDname("test_UPDATE");
		deptDao.update(dept);
	}
	@Test
	public void testInsertBatch()throws Exception{
		List<Dept> depts = new ArrayList<Dept>();
		for(int i=50000;i<60000;i++) {
			Dept dept = new Dept(i,"dname"+i,"loc"+i);
			depts.add(dept);
		}
		deptDao.insertBatch(depts);
	}

}
