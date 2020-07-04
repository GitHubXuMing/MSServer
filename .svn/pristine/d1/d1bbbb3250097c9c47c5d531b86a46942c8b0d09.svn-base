package com.company.jdbc.controller.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.company.jdbc.common.Const;
import com.company.jdbc.entity.Product;
import com.company.jdbc.service.ServiceFactory;
import com.company.jdbc.service.iservice.IProductService;

@WebServlet("/ProductFindAllServlet")
public class ProductFindAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1-取值
		//2-处理
		IProductService productService = ServiceFactory.getProductServiceInstance();
		List<Product> productList = productService.findAll();
		//3-反馈
		if(productList != null && productList.size()>0) {
			PrintWriter out = response.getWriter();
			//通过调用ali的fastjson.jar中的JSON对象方法，实现将obj转换为json格式的字符串
			String result = JSON.toJSONString(productList);
			out.write(result);
			out.close();
		}else {
			request.getSession().setAttribute(Const.ERROR_MSG, "商品查询失败");
			response.sendRedirect(request.getContextPath()+"/error.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
