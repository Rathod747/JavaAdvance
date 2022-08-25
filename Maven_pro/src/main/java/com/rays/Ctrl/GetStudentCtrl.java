package com.rays.Ctrl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.bean.StudentBean;
import com.rays.model.StudentModel;

@WebServlet("/GetStudentCtl")
public class GetStudentCtrl extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentBean bean = new StudentBean();

		StudentModel model = new StudentModel();

		try {
			List<StudentBean> list = new ArrayList<StudentBean>();
			list = model.getby(bean);

			RequestDispatcher rd = request.getRequestDispatcher("GetStudent.jsp");

			request.setAttribute("ok", list);

			rd.forward(request, response);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentBean bean = new StudentBean();

		StudentModel model = new StudentModel();

		try {
			List<StudentBean> list = new ArrayList<StudentBean>();
			list = model.getby(bean);

			RequestDispatcher rd = request.getRequestDispatcher("GetStudent.jsp");

			request.setAttribute("ok", list);

			rd.forward(request, response);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
