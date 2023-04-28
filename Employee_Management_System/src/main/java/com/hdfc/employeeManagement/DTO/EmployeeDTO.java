package com.hdfc.employeeManagement.DTO;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDTO {
	
	private int employeeId;
	private String employeeName;
	private String dateOfBirth;
	
	
	
}
