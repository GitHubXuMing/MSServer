package com.company.jdbc.dao.impl;

import org.junit.Before;
import org.junit.Test;

import com.company.jdbc.common.Const;
import com.company.jdbc.dao.idao.IReportDao;

public class ReportDaoTest {
	IReportDao reportDao;
	@Before
	public void setUp() throws Exception {
		reportDao = new ReportDao();
	}

	@Test
	public void testSelectAnnualSal() throws Exception {
		reportDao.selectAnnualSal(Const.Order.ANNUAL_SAL_DESC).stream().forEach(System.out::println);
	}
	@Test
	public void testSelectReport() throws Exception {
		reportDao.selectReport("2018-08").stream().forEach(System.out::println);
	}

}
