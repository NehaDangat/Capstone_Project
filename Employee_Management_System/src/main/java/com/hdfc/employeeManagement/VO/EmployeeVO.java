package com.hdfc.employeeManagement.VO;

import java.time.LocalDate;


public class EmployeeVO {

	
	private int employeeID;
	private String employeeName;
	private String dateOfBirth;
	
	
	
	
	public EmployeeVO(int employeeID, String employeeName, String dateOfBirth) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}


	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public EmployeeVO() {
		// TODO Auto-generated constructor stub
	}

}
