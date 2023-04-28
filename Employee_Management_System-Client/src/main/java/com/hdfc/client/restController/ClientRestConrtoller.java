package com.hdfc.client.restController;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hdfc.client.decrypter.Aes256;
import com.hdfc.client.entity.Employee;

@RestController
@RequestMapping("/client")
public class ClientRestConrtoller {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getEmployeeByEmployeeID/{employeeId}")
	public Employee getEmloyeeByID(@PathVariable int employeeId) throws Exception {
		
		String url = "https://localhost:1999/employee/getEmployeeByEmployeeId/";
		
		Employee employee = restTemplate.getForObject(url+employeeId,Employee.class);
		
		employee.setEmployeeId(employeeId);
		employee.setDateOfBirth(Aes256.decrypt(employee.getDateOfBirth()));
		
		return employee;
	
	}
	
	
}
	 
	
	
	
   
	