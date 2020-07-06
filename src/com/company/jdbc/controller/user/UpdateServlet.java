package com.company.jdbc.controller.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.company.jdbc.common.Res;
import com.company.jdbc.entity.User;
import com.company.jdbc.service.ServiceFactory;
import com.company.jdbc.service.iservice.IUserService;

@WebServlet("/user/updateUserServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1-取值并装配
		Integer id = Integer.parseInt(request.getParameter("id"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		BigDecimal sal = new BigDecimal(request.getParameter("sal"));
		User user = new User(id,username,password,sal);
		//2-处理
		IUserService userService = ServiceFactory.getUserServiceInstance();
		Res res = userService.update(user);
		//3-反馈
		String result = JSON.toJSONString(res);
		PrintWriter out = response.getWriter();
		out.println(result);
		out.close();
		
	}

}
