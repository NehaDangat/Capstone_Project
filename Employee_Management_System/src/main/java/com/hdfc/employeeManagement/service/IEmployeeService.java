package com.hdfc.employeeManagement.service;

import org.springframework.stereotype.Service;

import com.hdfc.employeeManagement.DTO.EmployeeDTO;
import com.hdfc.employeeManagement.VO.EmployeeVO;
import com.hdfc.employeeManagement.entity.Employee;
import com.hdfc.employeeManagement.exception.InvalidEmployeeIdException;


@Service
public interface IEmployeeService {
	
	public EmployeeVO getEmployeeById(int employeeId) throws InvalidEmployeeIdException;
}
