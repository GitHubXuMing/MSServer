package com.company.jdbc.service.impl;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.log4j.Logger;

import com.company.jdbc.dao.factory.DaoFactory;
import com.company.jdbc.dao.idao.IReportDao;
import com.company.jdbc.service.iservice.IReportService;
import com.company.jdbc.vo.AnnualSalVo;
import com.company.jdbc.vo.ReportVo;

public class ReportService implements IReportService {
	private static Logger log = Logger.getLogger(ReportService.class);
	private IReportDao reportDao;
	public ReportService() {
		reportDao = DaoFactory.getReportDaoInstance();
	}
	@Override
	public List<AnnualSalVo> selectAnnualSal(String... orderByCons) {
		List<AnnualSalVo> result = null;
		try {
			result = reportDao.selectAnnualSal(orderByCons);
		} catch (Exception e) {
			log.debug("生成年薪报表异常！",e);
		}	
		return result;
	}
	@Override
	public List<ReportVo> selectReport(String yearMonth) {
		//参数校验 yyyy-mm
		try {
			YearMonth.parse(yearMonth, DateTimeFormatter.ofPattern("yyyy-MM"));
		}catch(Exception e) {
			log.debug("日期类型输入错误",e);
			return null;
		}
		List<ReportVo> result = null;
		try {
			result = reportDao.selectReport(yearMonth);
		} catch (Exception e) {
			log.debug("生成部门薪资月报表异常！",e);
		}	
		return result;
	}
}
