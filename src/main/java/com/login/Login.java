package com.login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.login.dao.LoginDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	LoginDao logindao;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("uname");
		String pass = request.getParameter("pass");
		logindao = new LoginDao();
		
		if(logindao.validateUser(user.toLowerCase(), pass)) 
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", user);
			response.sendRedirect("welcome.jsp");
		}
		else 
		{
			
			response.sendRedirect("login.jsp");
		}
		
	}

	

}
