package com.klef.ep.services;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.dao.EmployeeDAO;
import com.klef.ep.models.Employee;

import java.io.*;
import java.sql.*;

@WebServlet("/updateemployee")
public class UpdateEmployeeServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		int id=Integer.parseInt(request.getParameter("eid"));
		String name=request.getParameter("ename");
		String gender=request.getParameter("egender");
		String dept=request.getParameter("edept");
		Double salary=Double.parseDouble(request.getParameter("esalary"));
		String joindate=request.getParameter("ejoindate");
		boolean managerstatus=Boolean.parseBoolean(request.getParameter("emanager"));
		
		Employee emp=new Employee();
		emp.setEmpid(id);
		emp.setEmpname(name);
		emp.setEmpgender(gender);
		emp.setEmpdepartment(dept);
		emp.setEmpsalary(salary);
		emp.setEmpjoiningdate(joindate);
		emp.setEmpmanager(managerstatus);
		
		EmployeeDAO empdao=new EmployeeDAO();
		int result=empdao.updateEmployee(emp);
		request.setAttribute("result", result);
		request.setAttribute("employee", emp);
		if(result>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("updatesuccess.jsp");
			rd.forward(request, response);
		}
	}
}