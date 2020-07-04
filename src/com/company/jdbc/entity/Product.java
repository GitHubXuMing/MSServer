package com.company.jdbc.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
	private int pid;
	private String pname;
	private BigDecimal price;
	private Date pdate;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, BigDecimal price, Date pdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.pdate = pdate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", pdate=" + pdate + "]";
	}
	
}
