package com.database.insertion;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;



import com.mysql.cj.jdbc.Driver;

public class RegisterDriver 
{
	public void jdbcConnection(ProductDetails prod)
	{
	Connection conn = null;
	PreparedStatement pstmt = null;
	Scanner sc = new Scanner(System.in);	
	try
		{
			Driver driverref = new Driver();
			DriverManager.deregisterDriver(driverref);
			
			String dburl = "jdbc:mysql://localhost:3306/ecommerce";
			conn = DriverManager.getConnection(dburl, "root","");
			
			String sql = "insert into products values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			
			FileInputStream fiImage = new FileInputStream(prod.getImage());
			
			pstmt.setString(1, prod.getName());
			pstmt.setDouble(2, prod.getPrice());
			pstmt.setString(3, prod.getDescription());
			pstmt.setInt(4, prod.getRating());
			pstmt.setBinaryStream(5, fiImage);
			int result = pstmt.executeUpdate();
			if(result != 0)
			{
				System.out.println("Data Inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(conn != null)
				{
					conn.close();
				}
				if(pstmt != null)
				{
					pstmt.close();
				}
			} catch(Exception e) {
				System.out.println("Not closed all objects");
			}
			
			
		}
	}
}
