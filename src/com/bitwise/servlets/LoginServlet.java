package com.bitwise.servlets;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.bitwise.validate.Validate;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static HashMap<String,String> messages ;
    
    public LoginServlet() {
    	messages = new HashMap<String,String>();
        
        }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("Inside Login Servlet " + username + password);
        UserAuthentication user = new UserAuthentication();
	        if(! Validate.isValidEmail(username)){
	        	System.out.println("email is valid");
	        	if(!(Validate.isEmpty(password))){
	        		System.out.println("password is valid");
	        		UserAuthentication userAuth = new UserAuthentication();
	        		if(userAuth.CheckIfUserIsAvailable(username, password)) {
	        			System.out.println("user is valid");
	        			request.getSession(true).setAttribute("username", username);
	        			response.sendRedirect("AddMovieShow.jsp");
	        		}
	        	}
	        	
	        }
        
        else
        	response.sendRedirect("Login.jsp");
        	
        
		doGet(request, response);
	}

}
