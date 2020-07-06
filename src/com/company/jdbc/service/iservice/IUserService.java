package com.company.jdbc.service.iservice;

import java.util.List;

import com.company.jdbc.common.Res;
import com.company.jdbc.entity.User;
import com.company.jdbc.vo.QueryVo;

public interface IUserService {
	Res exist(String username);

	Res<User> login(String username, String password);

	Res reg(String username, String password);

	Res<List<User>> findByPage(Integer page, Integer size);

	Res delete(Integer id);

	Res<User> findById(Integer id);

	Res update(User user);

	Res insert(User user);

	Res<List<User>> dynamicSelect(QueryVo qv);
}
