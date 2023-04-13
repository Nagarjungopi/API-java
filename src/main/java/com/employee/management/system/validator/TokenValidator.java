package com.employee.management.system.validator;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

@Component
public class TokenValidator {
	
	public boolean isValid(HttpServletRequest request) {
	
	  Enumeration<String> headers = request.getHeaderNames();
	
	  // Extract the encrypted token (JWE) form the Authorization Header
	
	  while(headers.hasMoreElements()) {
	
	        String key = headers.nextElement();
	
	        if(key.trim().equalsIgnoreCase("Authorization")) {
	
	                           String authorizationHeader = request.getHeader(key);
	
	            if(!authorizationHeader.isEmpty()) {
	
	                String[] tokenData = authorizationHeader.split(" ");
	
	                if(tokenData.length == 2 && 
	
	                   tokenData[0].trim().equalsIgnoreCase("Bearer")) {
	
	                    String token = tokenData[1];

	            //        logInfo("Received token: ");

	                     System.err.println("received token"+token);
	                    break;
	
	                }
	
	            }
	        }}
	return false;}}

