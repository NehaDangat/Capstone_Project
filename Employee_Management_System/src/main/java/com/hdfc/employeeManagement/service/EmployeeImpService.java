package com.hdfc.employeeManagement.service;

import java.nio.charset.StandardCharsets;
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.employeeManagement.DTO.EmployeeDTO;
import com.hdfc.employeeManagement.VO.EmployeeVO;
import com.hdfc.employeeManagement.encrypter.Aes256;
import com.hdfc.employeeManagement.entity.Employee;
import com.hdfc.employeeManagement.exception.InvalidEmployeeIdException;
import com.hdfc.employeeManagement.repository.IEmployeeRepository;

@Service
public class EmployeeImpService implements IEmployeeService {
	
	@Autowired
	IEmployeeRepository employeeRepository;
	
	
	
	
	@Override
	public EmployeeVO getEmployeeById(int employeeId ) throws InvalidEmployeeIdException {
		// TODO Auto-generated method stub
		Employee emp=employeeRepository.findById(employeeId).orElse(null);
		if(emp==null) {
			throw new InvalidEmployeeIdException("Employee not found with ID " + employeeId);
		}
		else {
			EmployeeVO vo=new EmployeeVO();
			String x=Aes256.encrypt(emp.getDateOfBirth().toString());
			vo.setDateOfBirth(x);
			vo.setEmployeeID(employeeId);
			vo.setEmployeeName(emp.getEmployeeName());
			return vo;
		}
		
	}

	
	
	
	
}
