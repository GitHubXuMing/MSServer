package com.company.jdbc.service.impl;

import java.util.List;

import com.company.jdbc.common.Res;
import com.company.jdbc.common.ResEnum;
import com.company.jdbc.dao.factory.DaoFactory;
import com.company.jdbc.dao.idao.IUserDao;
import com.company.jdbc.entity.User;
import com.company.jdbc.service.iservice.IUserService;

public class UserService implements IUserService {
	private IUserDao userDao;

	public UserService() {
		userDao = DaoFactory.getUserDaoInstance();
	}

	@Override
	public Res exist(String username) {
		Res res = null;
		try {
			int result = userDao.exist(username);
			res = (result==1)?Res.success(ResEnum.USER_EXIST):Res.success(ResEnum.USER_NOT_EXIST);
		} catch (Exception e) {
			e.printStackTrace();
			res = Res.error(ResEnum.ERROR);
		}
		return res;
	}

	@Override
	public Res<User> login(String username, String password) {
		Res res = null;
		try {
			User user = userDao.login(username,password);
			res = (user != null)?Res.success(ResEnum.SUCCESS,user):Res.error(ResEnum.PASSWORD_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			res = Res.error(ResEnum.ERROR);
		}
		return res;
	}

	@Override
	public Res reg(String username, String password) {
		try {
			userDao.reg(username,password);
			return  Res.success(ResEnum.SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
			return Res.error(ResEnum.ERROR);
		}
	}

	@Override
	public Res<List<User>> findByPage(Integer page, Integer size) {
		try {
			List<User> users = userDao.findByPage(page, size);
			if(users != null && users.size()>0) {
				return  Res.success(ResEnum.SUCCESS,users);
			}else {
				return Res.error(ResEnum.NO_DATA_FOUND_ERROR);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Res.error(ResEnum.ERROR);
		}
	}

}
