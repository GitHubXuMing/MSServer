package com.company.jdbc.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.company.jdbc.dao.idao.IEmpDao;
import com.company.jdbc.entity.Emp;
import com.company.jdbc.util.DBUtils;

public class EmpDao implements IEmpDao{
	public List<Emp> findAll() throws Exception{
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select empno,ename,job,mgr,hiredate,sal,IFNULL(comm,0) comm,deptno from emp";
		List<Emp> emps = qr.query(sql, new BeanListHandler<Emp>(Emp.class));
		return emps;
	}

	public List<Emp> findByPage(int page,int size)throws Exception{
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select empno,ename,job,mgr,hiredate,sal,comm,deptno from emp limit ?,?";
		List<Emp> emps = qr.query(sql, new BeanListHandler<Emp>(Emp.class),(page-1)*size,size);
		return emps;
	}
	
	public List<Emp> findByName(String name)throws Exception{
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select empno,ename,job,mgr,hiredate,sal,comm,deptno from emp where ename like concat('%',?,'%')";
		List<Emp> emps = qr.query(sql, new BeanListHandler<Emp>(Emp.class),name);
		return emps;
	}
	
	@Override
	public Emp findById(Integer id) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select empno,ename,job,mgr,hiredate,sal,comm,deptno from emp where empno=?";
		Emp emp = qr.query(sql, new BeanHandler<Emp>(Emp.class), id);
		return emp;
	}
	
	@Override
	public int insert(Emp emp) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "insert into emp(ename,job,mgr,hiredate,sal,comm,deptno) values(?,?,?,?,?,?,?)";
		int result = qr.update(sql, emp.getEname(),emp.getJob(),emp.getMgr(),emp.getHiredate(),emp.getSal(),emp.getComm(),emp.getDeptno());
		return result;
	}

	@Override
	public int delete(Emp emp) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "delete from emp where empno=?";
		int result = qr.update(sql, emp.getEmpno());
		return result;
	}

	@Override
	public int update(Emp emp) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "update emp set ename=?,job=?,mgr=?,hiredate=?,sal=?,comm=?,deptno=? where empno=?";
		int result = qr.update(sql, emp.getEname(),emp.getJob(),emp.getMgr(),emp.getHiredate(),emp.getSal(),emp.getComm(),emp.getDeptno(),emp.getEmpno());
		return result;
	}

}
