package com.company.jdbc.controller.router;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.company.jdbc.common.Const;

@WebServlet("/RouterServlet")
public class RouterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute(Const.User.CURRENT_USER) != null) {
			String uri = request.getParameter("uri");
			String[] url = StringUtils.split(uri, "-");
			request.getRequestDispatcher("/WEB-INF/" + url[0] + "/" + url[1] + ".jsp").forward(request, response);
		} else {
			session.setAttribute(Const.User.ERROR_MSG, "请先登录");
			response.sendRedirect(request.getContextPath() + "/error.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
