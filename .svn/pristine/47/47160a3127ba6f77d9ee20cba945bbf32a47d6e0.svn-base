package com.company.jdbc.controller.emp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.jdbc.common.Const;
import com.company.jdbc.entity.Emp;
import com.company.jdbc.service.ServiceFactory;
import com.company.jdbc.service.iservice.IEmpService;

@WebServlet("/EmpFindByIdServlet")
public class EmpFindByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1-取值
		int empno = Integer.parseInt(request.getParameter("empno"));
		//2-处理
		IEmpService empService = ServiceFactory.getEmpServiceInstance();
		Emp emp = empService.findById(empno);
		//3-反馈
		if(emp != null) {
			request.setAttribute("empFromServer", emp);
			request.getRequestDispatcher("/WEB-INF/emp/empDetails.jsp").forward(request, response);
		}else {
			HttpSession session = request.getSession();
			session.setAttribute(Const.ERROR_MSG, "没有该员工信息");
			response.sendRedirect(request.getContextPath()+"/error.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
