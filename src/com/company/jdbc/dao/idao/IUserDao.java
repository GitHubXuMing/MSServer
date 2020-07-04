package com.company.jdbc.dao.idao;

import java.math.BigDecimal;
import java.util.List;

import com.company.jdbc.entity.User;
import com.company.jdbc.vo.QueryVo;

public interface IUserDao extends IBaseDao<User,Integer> {

	User login(String username,String password)throws Exception;

	int regist(User user)throws Exception;

	User getUserInfo(int id)throws Exception;

	List<String> listUsernames()throws Exception;

	BigDecimal findBalanceByUsername(String accountFrom)throws Exception;

	boolean transMoney(String accountFrom, String accountTo, BigDecimal money);

	List<User> dynamicSearch(QueryVo vo)throws Exception;
	
	int exist(String username)throws Exception;

	int reg(String username, String password)throws Exception;
}
