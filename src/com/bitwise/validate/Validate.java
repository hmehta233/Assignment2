package com.bitwise.validate;

import java.util.HashMap;
import java.util.Map;

import com.bitwise.servlets.LoginServlet;
import com.bitwise.servlets.UserAuthentication;

public class Validate {
	
	public static boolean isEmpty(String param){
		if(param==null ||param.isEmpty()){
			return true;
		}
		return false;
		
	}
	public static boolean isValidEmail(String email) {
		if(isEmpty(email)){
				LoginServlet.messages.put("email", "Please enter email");
		}
		return false;				
	}
 
	

}
