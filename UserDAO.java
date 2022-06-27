package com.klef.ep.dao;

import java.sql.*;

import com.klef.ep.models.User;

public class UserDAO 
{
    public boolean checklogin(User u)
    {
    	boolean status=false;
      try
      {
    	 	Connection con = DBConnection.getConnection();
        	
        	PreparedStatement pstmt = con.prepareStatement(" select * from login where username=? and password=?  ");
      
        	pstmt.setString(1, u.getUsername());
        	pstmt.setString(2, u.getPassword());
        	
        	ResultSet rs = pstmt.executeQuery();
        	
        	if(rs.next())
        	{
        		status = true;
        	}
      }
      catch(Exception e)
      {
    	  System.out.println(e);
      }
      return status;
    }
}
