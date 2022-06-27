package com.klef.ep.services;


import java.sql.*;

public class DBConnection 
{
	static Connection con =null;
	public  static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");	
		    System.out.println("Driver Class Loaded");
		    
		   con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/it_industry?useSSL=false","root","Anuhy@2002");
		    System.out.println("Connection Established Successfully");
		}
		catch(Exception e)
		{
		   System.out.println(e);	
		}
		return con;
	}
	
	
}
