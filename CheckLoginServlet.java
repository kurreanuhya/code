package com.klef.ep.services;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.dao.UserDAO;
import com.klef.ep.models.User;

import java.io.*;
import java.sql.*;

@WebServlet("/checkuserlogin")
public class CheckLoginServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		User u = new User();
		u.setUsername(uname);
		u.setPassword(pwd);
		
		UserDAO dao = new UserDAO();
		boolean result = dao.checklogin(u);
		
		
		
		request.setAttribute("result", result);
		request.setAttribute("user", u); // object
		
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}
}