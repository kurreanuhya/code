package com.klef.ep.services;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.dao.EmployeeDAO;
import com.klef.ep.models.Employee;

import java.io.*;
import java.sql.*;

@WebServlet("/deleteemployee")
public class DeleteEmployeeServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		int id=Integer.parseInt(request.getParameter("empid"));
		
		EmployeeDAO empdao=new EmployeeDAO();
		int result=empdao.deleteEmployee(id);
		request.setAttribute("result", result);
		request.setAttribute("empid", id);
		if(result>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("deletesuccess.jsp");
			rd.forward(request, response);
		}
	}
}