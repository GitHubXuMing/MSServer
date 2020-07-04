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

@WebServlet("/user/findAllServlet")
public class FindAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1-分页取值
		String pageStr = request.getParameter("page");
		Integer page = Integer.valueOf(pageStr==null?"1":pageStr);
		String sizeStr = request.getParameter("size");
		Integer size = Integer.valueOf(sizeStr==null?"10":sizeStr);
		
		//2-处理
		IUserService userService = ServiceFactory.getUserServiceInstance();
		Res<List<User>> res = userService.findByPage(page ,size);
		//3-反馈
		String jsonStr = JSON.toJSONString(res);
		PrintWriter out = response.getWriter();
		out.println(jsonStr);
		out.close();
	}
}
