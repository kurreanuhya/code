package com.klef.ep.dao;
import java.sql.*;
import java.util.*;

import com.klef.ep.models.Employee;

public class EmployeeDAO 
{
	public int insertEmployee(Employee emp)
	{
		int n=0;
		try
		{
			Connection con=DBConnection.getConnection();
			PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
			pstmt.setInt(1, emp.getEmpid());
			pstmt.setString(2,emp.getEmpname());
			pstmt.setString(3, emp.getEmpgender());
			pstmt.setString(4, emp.getEmpdepartment());
			pstmt.setDouble(5, emp.getEmpsalary());
			pstmt.setString(6, emp.getEmpjoiningdate());
			pstmt.setBoolean(7, emp.isEmpmanager());
			n=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}
	public List<Employee> viewEmployees()
	{
		List<Employee> employees=new ArrayList<Employee>();
		try
		{
			Connection con=DBConnection.getConnection();
			PreparedStatement pstmt=con.prepareStatement("select * from employee");
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				Employee emp=new Employee();
				emp.setEmpid(rs.getInt(1));
				emp.setEmpname(rs.getString(2));
				emp.setEmpgender(rs.getString(3));
				emp.setEmpdepartment(rs.getString(4));
				emp.setEmpsalary(rs.getDouble(5));
				emp.setEmpjoiningdate(rs.getString(6));
				emp.setEmpmanager(rs.getBoolean(7));
				
				employees.add(emp);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return employees;
	}
	
	public int deleteEmployee(int empid)
	{
		int n=0;
		try
		{
			Connection con=DBConnection.getConnection();
			PreparedStatement pstmt=con.prepareStatement("delete from employee where empid=?");
			pstmt.setInt(1, empid);
			n=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}
	public Employee viewEmployeeById(int empid)
	{
		Employee emp=new Employee();
		try
		{
			Connection con=DBConnection.getConnection();
			PreparedStatement pstmt=con.prepareStatement("select * from employee where empid=?");
			pstmt.setInt(1, empid);
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				emp.setEmpid(rs.getInt(1));
				emp.setEmpname(rs.getString(2));
				emp.setEmpgender(rs.getString(3));
				emp.setEmpdepartment(rs.getString(4));
				emp.setEmpsalary(rs.getDouble(5));
				emp.setEmpjoiningdate(rs.getString(6));
				emp.setEmpmanager(rs.getBoolean(7));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return emp;
	}
	public int updateEmployee(Employee emp)
	{
		int n=0;
		try
		{
			Connection con=DBConnection.getConnection();
			PreparedStatement pstmt=con.prepareStatement("update employee set empname=?,empgender=?,empdepartment=?,empsalary=?,empjoiningdate=?,empmanager=? where empid=?");
			pstmt.setString(1, emp.getEmpname());
			pstmt.setString(2, emp.getEmpgender());
			pstmt.setString(3, emp.getEmpdepartment());
			pstmt.setDouble(4, emp.getEmpsalary());
			pstmt.setString(5, emp.getEmpjoiningdate());
			pstmt.setBoolean(6, emp.isEmpmanager());
			pstmt.setInt(7, emp.getEmpid());
			n=pstmt.executeUpdate();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}
}
