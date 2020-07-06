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

@WebServlet("/user/deleteUserServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1-取值
		Integer id = Integer.parseInt(request.getParameter("id"));
		//2-处理
		IUserService userService = ServiceFactory.getUserServiceInstance();
		Res resultRes = userService.delete(id);
		//3-反馈
		String result = JSON.toJSONString(resultRes);
		PrintWriter out = response.getWriter();
		out.println(result);
		out.close();
	}

}
