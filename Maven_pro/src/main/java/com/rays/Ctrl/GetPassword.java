package com.rays.Ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.bean.Regestrationbean;
import com.rays.model.UserModel;

@WebServlet("/getpwd")
public class GetPassword extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String userid = request.getParameter("userid");

		UserModel model = new UserModel();
		Regestrationbean bean = new Regestrationbean();

		try {
			bean = model.forget(userid);
			RequestDispatcher rd = request.getRequestDispatcher("ForgetyourPassword.jsp");
			request.setAttribute("pass", bean.getPwd());
			rd.forward(request, response);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
