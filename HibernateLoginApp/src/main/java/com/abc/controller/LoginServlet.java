package com.abc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.dao.UserDao;
import com.abc.dto.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	   String username =request.getParameter("uname");
	   String userpwd =request.getParameter("upwd");
	   
	   User user=new User();
	   user.setUsername(username);
	   user.setPassword(userpwd);
	   
	   UserDao dao=new UserDao();
	   String status = dao.userService(user);
	   
	   RequestDispatcher rd =null;
	   if(status.equals("success"))
	   {
		   rd.request.getRequestDispatcher("./success.html");
		   rd.forward(request, response);
	   }else {
		   rd.request.getRequestDispatcher("./failure.html");
		   rd.forward(request, response);
	   }
	   
	}

}
