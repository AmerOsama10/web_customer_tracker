package com.luv2code.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user ="customer_user";
		String pass ="customer_user";
		String url ="jdbc:mysql://localhost:3306/customer_tracker";
		//get connection to database
		try {
			PrintWriter out =response.getWriter();
			
			out.println("Connecting to database : "+ url);
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url,user,pass);
			out.println("SUCCESS !!! ");
			con.close();

			
		} catch(Exception ex) {
			ex.printStackTrace();
			throw new ServletException(ex);
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
