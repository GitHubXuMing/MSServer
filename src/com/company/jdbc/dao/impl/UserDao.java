package com.company.jdbc.dao.impl;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.company.jdbc.dao.idao.IUserDao;
import com.company.jdbc.entity.User;
import com.company.jdbc.util.DBUtils;
import com.company.jdbc.vo.QueryVo;

public class UserDao implements IUserDao {
	// DQL
	@Override
	public User login(String username, String password) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select id,username,sal from user where username=? and password=?";
		User user = qr.query(sql, new BeanHandler<User>(User.class), username, password);
		return user;
	}

	@Override
	public User getUserInfo(int id) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select id,username,password,sal from user where id=?";
		User user = qr.query(sql, new BeanHandler<User>(User.class), id);
		return user;
	}

	@Override
	public List<User> findByName(String username) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select id,username,password,sal from user where username like concat('%',?,'%')";
		List<User> users = qr.query(sql, new BeanListHandler<User>(User.class), username);
		return users;
	}

	@Override
	public int regist(User user) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "insert into user(username,password,sal) values(?,?,?)";
		int result = qr.update(sql, user.getUsername(), user.getPassword(), user.getSal());
		return result;
	}

	@Override
	public int insert(User t) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "insert into user(username,password,sal) values(?,?,?)";
		int result = qr.update(sql, t.getUsername(), t.getPassword(), t.getSal());
		return result;
	}

	@Override
	public int delete(User t) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "delete from user where id=?";
		int result = qr.update(sql, t.getId());
		return result;
	}

	@Override
	public int update(User t) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "update user set username=?,password=?,sal=? where id=?";
		int result = qr.update(sql, t.getUsername(), t.getPassword(), t.getSal(), t.getId());
		return result;
	}

	@Override
	public List<User> findAll() throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select id,username,password,sal from user";
		List<User> users = qr.query(sql, new BeanListHandler<User>(User.class));
		return users;
	}

	@Override
	public List<User> findByPage(int page, int size) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select id,username,password,sal from user limit ?,?";
		List<User> users = qr.query(sql, new BeanListHandler<User>(User.class), (page - 1) * size, size);
		return users;
	}

	@Override
	public User findById(Integer id) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select id,username,password,sal from user where id=?";
		User user = qr.query(sql, new BeanHandler<User>(User.class), id);
		return user;
	}

	@Override
	public List<String> listUsernames() throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select username from user";
		List<String> usernames = qr.query(sql, new ColumnListHandler<String>("username"));
		return usernames;
	}

	@Override
	public BigDecimal findBalanceByUsername(String accountFrom) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select sal from user where username=?";
		BigDecimal balance = qr.query(sql, new BeanHandler<BigDecimal>(BigDecimal.class), accountFrom);
		return balance;
	}

	@Override
	public boolean transMoney(String accountFrom, String accountTo, BigDecimal money) {
		Connection con = null;
		try {
			con = DBUtils.getConnection();

			con.setAutoCommit(false);// 关闭自动提交功能

			QueryRunner qr = new QueryRunner();
			String sql1 = "update user set sal=sal-? where username=?";
			qr.update(con, sql1, money, accountFrom);
			String sql2 = "update user set sal=sal+? where username=?";
			qr.update(con, sql2, money, accountTo);

			con.commit();// 手动提交SQL语句执行结果
			return true;
		} catch (Exception e) {
			try {
				if (con != null)
					con.rollback();// 回滚
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			return false;
		} finally {
			DBUtils.close(null, null, con);
		}
	}

	@Override
	public List<User> dynamicSearch(QueryVo vo) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		if (vo.getMinSal() == null || vo.getMinSal().trim().equals("")) {
			vo.setMinSal("0");
		}
		if (vo.getMaxSal() == null || vo.getMaxSal().trim().equals("")) {
			vo.setMaxSal("99999");
		}
		StringBuilder buffer = new StringBuilder("select id,username,password,sal from user where sal between "
				+ vo.getMinSal() + " and " + vo.getMaxSal() + " ");
		if (vo.getId() != null && vo.getId().length() > 0) {
			buffer.append("and id=" + vo.getId()+" ");
		}
		if (vo.getUsername() != null && vo.getUsername().trim().length() > 0) {
			buffer.append("and username like '%" + vo.getUsername() + "%'");
		}

		String sql = buffer.toString();
		List<User> users = qr.query(sql, new BeanListHandler<User>(User.class));
		return users;
	}

	@Override
	public int exist(String username) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "select count(*) from user where username=?";
		Long result = qr.query(sql, new ScalarHandler<Long>(), username);
		return result.intValue();
	}

	@Override
	public int reg(String username, String password) throws Exception {
		QueryRunner qr = new QueryRunner(DBUtils.dataSource);
		String sql = "insert into user(username,password,sal) values(?,?,?)";
		int result = qr.update(sql, username, password, new BigDecimal("0"));
		return result;
	}

}
