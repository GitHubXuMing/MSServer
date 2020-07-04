package com.company.jdbc.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.company.jdbc.dao.idao.IReportDao;
import com.company.jdbc.util.DBUtils;
import com.company.jdbc.vo.AnnualSalVo;
import com.company.jdbc.vo.ReportVo;


public class ReportDao implements IReportDao {

	@Override
	public List<AnnualSalVo> selectAnnualSal(String... orderByCons) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		StringBuffer buffer = new StringBuffer("select e.empno,e.ename,d.dname,(sal+IFNULL(comm,0))*12 annualSal  from emp e left join dept d on e.deptno=d.deptno");
		if(orderByCons != null && orderByCons.length > 0) {
			 buffer.append(" order by ");
			 for(String obc:orderByCons) {
				 buffer.append(obc).append(",");
			 }
		}
		String sql = buffer.substring(0, buffer.length()-1);
		List<AnnualSalVo> result = qr.query(sql, new BeanListHandler<AnnualSalVo>(AnnualSalVo.class));
		return result;
	}

	@Override
	public List<ReportVo> selectReport(String yearMonth) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select d.dname,avg(e.sal) avgsal,sum(e.sal) sumsal,count(*) num from emp e join dept d on e.deptno=d.deptno where e.hiredate<LAST_DAY(STR_TO_DATE(?,'%Y-%m')) group by e.deptno order by d.dname";
		List<ReportVo> result = qr.query(sql, new BeanListHandler<ReportVo>(ReportVo.class), yearMonth);
		return result;
	}

}
