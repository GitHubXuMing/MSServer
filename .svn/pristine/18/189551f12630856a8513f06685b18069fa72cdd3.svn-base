package com.company.jdbc.service.iservice;

import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.company.jdbc.common.Res;
import com.company.jdbc.entity.User;
import com.company.jdbc.service.impl.UserService;

public class IUserServiceTest {

	private IUserService userService = new UserService();
	
	@Test
	public void testExist() {
		Res result = userService.exist("zhao**");
		System.err.println(result.getStatus());
		System.err.println(result.getMsg());
	}
	@Test
	public void testReg() {
		Res result = userService.reg("scott123", "123");
		System.err.println(result);
	}
	@Test
	public void testFindByPage() {
		Res<List<User>> result = userService.findByPage(10, 10);
		System.err.println(JSON.toJSONString(result));
	}
}
