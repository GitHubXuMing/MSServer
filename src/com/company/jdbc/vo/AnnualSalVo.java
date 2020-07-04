package com.company.jdbc.vo;

import java.math.BigDecimal;

public class AnnualSalVo {
	private int empno;
	private String ename;
	private String dname;
	private BigDecimal annualSal;
	public AnnualSalVo() {
	}
	public AnnualSalVo(int empno, String ename, String dname, BigDecimal annualSal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.dname = dname;
		this.annualSal = annualSal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public BigDecimal getAnnualSal() {
		return annualSal;
	}
	public void setAnnualSal(BigDecimal annualSal) {
		this.annualSal = annualSal;
	}
	@Override
	public String toString() {
		return "AnnualSalVo [empno=" + empno + ", ename=" + ename + ", dname=" + dname + ", annualSal=" + annualSal
				+ "]";
	}
	
}
