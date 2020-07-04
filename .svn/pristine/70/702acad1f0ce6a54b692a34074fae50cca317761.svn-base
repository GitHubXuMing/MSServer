package com.company.jdbc.util;

import java.sql.Connection;

import org.junit.Test;


public class DBUtilsTest {
	
	@Test
	public void testGetConnection() throws Exception {
		System.err.println(DBUtils.dataSource);
		Connection con1 = DBUtils.getConnection();
		Connection con2 = DBUtils.getConnection();
		System.err.println(con1);
		System.err.println(con2);
		System.err.println(DBUtils.dataSource);
		con1.close();
		con2.close();
		
	}

}
