package com.company.jdbc.dao.factory;

import com.company.jdbc.dao.idao.IDeptDao;
import com.company.jdbc.dao.idao.IEmpDao;
import com.company.jdbc.dao.idao.IProductDao;
import com.company.jdbc.dao.idao.IReportDao;
import com.company.jdbc.dao.idao.IUserDao;
import com.company.jdbc.dao.impl.DeptDao;
import com.company.jdbc.dao.impl.EmpDao;
import com.company.jdbc.dao.impl.ProductDao;
import com.company.jdbc.dao.impl.ReportDao;
import com.company.jdbc.dao.impl.UserDao;

public class DaoFactory {
	public static IDeptDao getDeptDaoInstance() {
		return new DeptDao();
	}
	public static IUserDao getUserDaoInstance() {
		return new UserDao();
	}
	public static IEmpDao getEmpDaoInstance() {
		return new EmpDao();
	}
	public static IReportDao getReportDaoInstance() {
		return new ReportDao();
	}
	public static IProductDao getProductDaoInstance() {
		return new ProductDao();
	}
}
