package com.company.jdbc.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtils {
	public static ComboPooledDataSource dataSource;
	static {
		dataSource = new ComboPooledDataSource("xing_mysql");
	}
	public static Connection getConnection() throws Exception {
		return dataSource.getConnection();
	}
	public static void close(ResultSet rs, Statement ps, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
