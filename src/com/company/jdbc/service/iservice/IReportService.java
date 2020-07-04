package com.company.jdbc.service.iservice;

import java.util.List;

import com.company.jdbc.vo.AnnualSalVo;
import com.company.jdbc.vo.ReportVo;

public interface IReportService {

	List<AnnualSalVo> selectAnnualSal(String... orderByCons);
	List<ReportVo> selectReport(String yearMonth);
}
