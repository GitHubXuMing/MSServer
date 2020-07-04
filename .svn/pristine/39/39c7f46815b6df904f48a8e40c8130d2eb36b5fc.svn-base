package com.company.jdbc.dao.impl;

import java.util.List;
import java.util.stream.IntStream;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.company.jdbc.dao.idao.IDeptDao;
import com.company.jdbc.entity.Dept;
import com.company.jdbc.util.DBUtils;

public class DeptDao implements IDeptDao {
	public List<Dept> findAll() throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select deptno,dname,loc from dept";
		List<Dept> depts = qr.query(sql, new BeanListHandler<Dept>(Dept.class));
		return depts;
	}

	public List<Dept> findByPage(int page, int size) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select deptno,dname,loc from dept limit ?,?";
		List<Dept> depts = qr.query(sql, new BeanListHandler<Dept>(Dept.class), (page - 1) * size, size);
		return depts;
	}

	public List<Dept> findByName(String name) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select deptno,dname,loc from dept where dname like concat('%',?,'%')";
		List<Dept> depts = qr.query(sql, new BeanListHandler<Dept>(Dept.class), name);
		return depts;
	}

	@Override
	public int insert(Dept dept) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "insert into dept(dname,loc) values(?,?)";
		int result = qr.update(sql, dept.getDname(), dept.getLoc());
		return result;
	}

	@Override
	public int delete(Dept dept) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "delete from dept where deptno=?";
		int result = qr.update(sql, dept.getDeptno());
		return result;
	}

	@Override
	public int update(Dept dept) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "update dept set dname=?,loc=? where deptno=?";
		int result = qr.update(sql, dept.getDname(), dept.getLoc(), dept.getDeptno());
		return result;
	}

	@Override
	public Dept findById(Integer id) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select deptno,dname,loc from dept where deptno=?";
		Dept dept = qr.query(sql, new BeanHandler<Dept>(Dept.class), id);
		return dept;
	}

	@Override
	public int insertBatch(List<Dept> depts) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "insert into dept(dname,loc) values(?,?)";
		String[][]params = new String[depts.size()][2];
		for(int i=0;i<depts.size();i++) {
			Dept dept = depts.get(i);
			params[i][0] = dept.getDname();
			params[i][1] = dept.getLoc();
			}
		int[] results = qr.batch(sql, params);
		return (int) IntStream.of(results).summaryStatistics().getSum();
	}
}
