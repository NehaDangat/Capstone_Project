package com.hdfc.employeeManagement;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.hdfc.employeeManagement.repository.IEmployeeRepository;

@SpringBootTest
class EmployeeManagementSystemApplicationTests {

	@Autowired
	IEmployeeRepository employeeRepository;
	
	@Test
	public void getByEmployeeId()
	{
		 employeeRepository.findById(1).get();
		
	}
}
