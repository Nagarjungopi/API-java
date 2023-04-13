package com.employee.management.system.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.system.helper.EmployeeHelper;
import com.employee.management.system.pojo.CustomPojo;
import com.employee.management.system.pojo.EmployeePojo;
import com.employee.management.system.validator.TokenValidator;

@RestController
@RequestMapping("/management")
public class EmployeeController {
 
	@Autowired
	private EmployeeHelper employeeHelper;
	
	@Autowired
	private TokenValidator validator;
	
	@GetMapping("/employee")
	public String employee(String employee) {
		System.err.println("employee controller");
		//validator.isValid();
		return "Controller running well";
		
	}
	@PostMapping("/register-employee")
	public List<EmployeePojo> addEmployee(@RequestBody CustomPojo pojo){
		return employeeHelper.addEmployee(pojo);
	}
	
	
}
