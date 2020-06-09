package com.webview.products;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.Driver;

public class ProductView extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String dburl = "jdbc:mysql://localhost:3306/ecommerce";
		String query = "select * from products";
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		int num = 0;
		try
		{
			// Load the Driver
			Driver driverref = new Driver();
			
			// Register the Driver by invoking registerDriver() 
			DriverManager.registerDriver(driverref);
			
			// Connection Created 
			conn = DriverManager.getConnection(dburl, "root", "");

			stmt = conn.createStatement();
			
			res = stmt.executeQuery(query);
			
			FileOutputStream outputStream = new FileOutputStream("/home/mohit/eclipse-workspace/MobileProducts/loadedimage/new"+num+".jpg");
			PrintWriter out = null;
			while(res.next())
			{		
				
				out = resp.getWriter();
				out.println("Product Name : "+res.getString(1));
				out.println("Product Price : "+res.getInt(2));
				out.println("Product Description : "+res.getString(3));
				out.println("Product Rating :"+res.getInt(4));
				InputStream inputStream = res.getBinaryStream(5);
				
				
				while(res.next()) 
				{			
					byte []buffer = new byte[1024];
					while(inputStream.read(buffer) > 0 ) 
					{
						outputStream.write(buffer);
					}
				}
			}
			System.out.println("Image Retrieved");
			outputStream.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					conn.close();
				}
				if(res != null) {
					res.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		
		}
	
	}
}
