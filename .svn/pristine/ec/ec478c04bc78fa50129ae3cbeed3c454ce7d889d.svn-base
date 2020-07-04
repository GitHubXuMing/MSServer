package com.company.jdbc.service.impl;

import java.util.List;

import com.company.jdbc.common.ResultEnum;
import com.company.jdbc.dao.factory.DaoFactory;
import com.company.jdbc.dao.idao.IEmpDao;
import com.company.jdbc.entity.Emp;
import com.company.jdbc.service.iservice.IEmpService;

public class EmpService implements IEmpService {

	private IEmpDao empDao;

	public EmpService() {
		empDao = DaoFactory.getEmpDaoInstance();
	}

	@Override
	public String insert(Emp t) {
		if (t == null || t.getEname() == null) {
			return ResultEnum.ERROR_ILLEGLE_ARGUMENTS.getMsg();
		}
		int result = 0;
		try {
			result = empDao.insert(t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result > 0 ? ResultEnum.SUCCESS.getMsg() : ResultEnum.ERROR_INSERT.getMsg();
	}

	@Override
	public String delete(Emp t) {
		if (t == null || t.getEmpno() <= 0) {
			return ResultEnum.ERROR_ILLEGLE_ARGUMENTS.getMsg();
		}
		int result = 0;
		try {
			result = empDao.delete(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? ResultEnum.SUCCESS.getMsg() : ResultEnum.ERROR_DELETE.getMsg();
	}

	@Override
	public String update(Emp t) {
		if (t == null || t.getEmpno() <= 0) {
			return ResultEnum.ERROR_ILLEGLE_ARGUMENTS.getMsg();
		}
		int result = 0;
		try {
			result = empDao.update(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? ResultEnum.SUCCESS.getMsg() : ResultEnum.ERROR_UPDATE.getMsg();
	}

	@Override
	public List<Emp> findAll() {
		List<Emp> empList = null;
		try {
			empList = empDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public List<Emp> findByPage(int page, int size) {
		List<Emp> empList = null;
		try {
			empList = empDao.findByPage(page,size);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public List<Emp> findByName(String name) {
		List<Emp> empList = null;
		try {
			empList = empDao.findByName(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public Emp findById(Integer id) {
		Emp emp = null;
		try {
			emp = empDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

}
