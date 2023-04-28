package com.hdfc.client.exceotion;

public class InvalidEmployeeIdException extends Exception {
	
	public InvalidEmployeeIdException(String errorMessage) {
        
		super(errorMessage);
    }

}
