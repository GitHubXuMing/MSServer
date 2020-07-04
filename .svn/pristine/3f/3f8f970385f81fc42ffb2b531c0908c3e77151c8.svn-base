package com.company.jdbc.service.iservice;

import java.util.List;

import com.company.jdbc.common.Res;
import com.company.jdbc.entity.User;

public interface IUserService {
	Res exist(String username);

	Res<User> login(String username, String password);

	Res reg(String username, String password);

	Res<List<User>> findByPage(Integer page, Integer size);
}
