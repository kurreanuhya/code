package com.klef.ep.services;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.dao.EmployeeDAO;
import com.klef.ep.models.Employee;

import java.io.*;
import java.sql.*;
import java.util.List;

@WebServlet("/viewemployeebyid")
public class ViewEmployeeByIdServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		int id=Integer.parseInt(request.getParameter("empid"));
		EmployeeDAO empdao=new EmployeeDAO();
		Employee emp=empdao.viewEmployeeById(id);
		RequestDispatcher rd=request.getRequestDispatcher("displayemployee.jsp");
		request.setAttribute("emp", emp);
		rd.forward(request, response);
	}
}