package com.company.jdbc.service.iservice;

import org.junit.Before;
import org.junit.Test;

import com.company.jdbc.service.impl.ReportService;

public class IReportServiceTest {
	private IReportService reportService;
	@Before
	public void setUp() {
		reportService = new ReportService();
	}
	@Test
	public void testSelectReport() throws Exception {
		reportService.selectReport("2018-13").stream().forEach(System.out::println);
	}
}
