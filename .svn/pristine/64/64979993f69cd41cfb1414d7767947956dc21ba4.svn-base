package com.company.jdbc.service;

import com.company.jdbc.service.impl.EmpService;
import com.company.jdbc.service.impl.ProductService;
import com.company.jdbc.service.impl.ReportService;
import com.company.jdbc.service.impl.UserService;
import com.company.jdbc.service.iservice.IEmpService;
import com.company.jdbc.service.iservice.IProductService;
import com.company.jdbc.service.iservice.IReportService;
import com.company.jdbc.service.iservice.IUserService;

public class ServiceFactory {
	public static IEmpService getEmpServiceInstance() {
		return new EmpService();
	}

	public static IUserService getUserServiceInstance() {
		return new UserService();
	}

	public static IReportService getReportServiceInstance() {
		return new ReportService();
	}
	public static IProductService getProductServiceInstance() {
		return new ProductService();
	}
}
