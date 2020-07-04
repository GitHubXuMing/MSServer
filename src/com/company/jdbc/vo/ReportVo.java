package com.company.jdbc.vo;

import java.math.BigDecimal;

public class ReportVo {
	private String dname;
	private BigDecimal avgsal;
	private BigDecimal sumsal;
	private int num;
	public ReportVo() {
		// TODO Auto-generated constructor stub
	}
	public ReportVo(String dname, BigDecimal avgsal, BigDecimal sumsal, int num) {
		super();
		this.dname = dname;
		this.avgsal = avgsal;
		this.sumsal = sumsal;
		this.num = num;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public BigDecimal getAvgsal() {
		return avgsal;
	}
	public void setAvgsal(BigDecimal avgsal) {
		this.avgsal = avgsal;
	}
	public BigDecimal getSumsal() {
		return sumsal;
	}
	public void setSumsal(BigDecimal sumsal) {
		this.sumsal = sumsal;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "ReportVo [dname=" + dname + ", avgsal=" + avgsal + ", sumsal=" + sumsal + ", num=" + num + "]";
	}
	
}
