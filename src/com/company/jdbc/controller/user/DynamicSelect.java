package com.company.jdbc.controller.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
import com.company.jdbc.vo.QueryVo;

@WebServlet("/user/dynamicSelect")
public class DynamicSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String username = request.getParameter("username");
		String minSal = request.getParameter("minSal");
		String maxSal = request.getParameter("maxSal");
		QueryVo qv = new QueryVo(id,username,minSal,maxSal);
		IUserService userService = ServiceFactory.getUserServiceInstance();
		Res<List<User>> result = userService.dynamicSelect(qv);
		String json = JSON.toJSONString(result);
		PrintWriter out = response.getWriter();
		out.println(json);
		out.close();
	}

}
