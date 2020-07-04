package com.company.jdbc.controller.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.company.jdbc.common.Res;
import com.company.jdbc.service.ServiceFactory;
import com.company.jdbc.service.iservice.IUserService;

@WebServlet("/user/userInsertServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1-取值
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//2-处理
		IUserService userService = ServiceFactory.getUserServiceInstance();
		Res result = userService.reg(username,password);
		//3-反馈
		String json = JSON.toJSONString(result);
		PrintWriter out = response.getWriter();
		out.println(json);
		out.close();
	}

}
