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

@WebServlet(urlPatterns = { "/LoginCtrl" })

public class LoginCtrl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userid = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String pwdreg = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";

		Regestrationbean bean = new Regestrationbean();
		UserModel model = new UserModel();

		if (userid.equals("") && pwd.equals("")) {

			RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");

			request.setAttribute("userid", "Enter Your EmailId ");
			request.setAttribute("pwd", "Enter Your Password");

			rd.forward(request, response);

		} else if (userid.equals("")) {
			RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");
			request.setAttribute("userid", "enter email id");

			rd.forward(request, response);
		} else if (!userid.matches(emailreg)) {
			RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");
			request.setAttribute("userid", "enter currect email id");

			rd.forward(request, response);
		} else if (pwd.equals("")) {
			RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");

			request.setAttribute("pwd", "enter password ");
			rd.forward(request, response);
		} else if (!pwd.matches(pwdreg)) {
			RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");

			request.setAttribute("pwd", "enter currect password ");
			rd.forward(request, response);
		} else {

			System.out.println("do post");
			try {
				bean = model.Authenticate(userid, pwd);

				if (bean.getFname() != null) {
					RequestDispatcher rd = request.getRequestDispatcher("WelcomePage.jsp");
					request.setAttribute("Myname", bean.getFname());
					rd.forward(request, response);
				} else {
					RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");
					request.setAttribute("msg", "you are not registered please signup");
					rd.forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Error in Authenticate ");

			}
		}

	}

}
