package com.hdfc.employeeManagement.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hdfc.employeeManagement.VO.EmployeeVO;

import com.hdfc.employeeManagement.exception.InvalidEmployeeIdException;

import com.hdfc.employeeManagement.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	@Autowired
	IEmployeeService employeeService;
	
	@GetMapping("/getEmployeeByEmployeeId/{employeeId}")
	public EmployeeVO getEmployeeById(@PathVariable int employeeId) throws InvalidEmployeeIdException , Exception {
		
		return employeeService.getEmployeeById(employeeId);
	}
	
}
