package com.company.jdbc.controller.emp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
import com.company.jdbc.vo.EmpVo;

@WebServlet("/EmpFindAllServlet")
public class EmpFindAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//2-处理
		IEmpService empService = ServiceFactory.getEmpServiceInstance();
		List<Emp> empList = empService.findAll();
		List<EmpVo> empvos = null;
		//vo装配
		if(empList != null && empList.size()>0) {
			empvos = new ArrayList<EmpVo>();
			for(Emp emp:empList) {
				EmpVo vo = new EmpVo(emp.getEmpno(),emp.getEname());
				empvos.add(vo);
			}
		}
		//3-反馈
		if(empvos != null) {
			request.setAttribute("empvosFromServer", empvos);
			request.getRequestDispatcher("/WEB-INF/emp/empFindAll.jsp").forward(request, response);
		}else {
			HttpSession session = request.getSession();
			session.setAttribute(Const.ERROR_MSG, "没有任何员工信息");
			response.sendRedirect(request.getContextPath()+"/error.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
