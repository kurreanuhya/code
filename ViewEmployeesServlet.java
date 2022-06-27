package com.klef.ep.services;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.dao.EmployeeDAO;
import com.klef.ep.models.Employee;

import java.io.*;
import java.sql.*;
import java.util.List;

@WebServlet("/viewemployees")
public class ViewEmployeesServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		EmployeeDAO empdao=new EmployeeDAO();
		List<Employee> employees=empdao.viewEmployees();
		RequestDispatcher rd=request.getRequestDispatcher("viewemployees.jsp");
		request.setAttribute("employees", employees);
		rd.forward(request, response);
	}
}