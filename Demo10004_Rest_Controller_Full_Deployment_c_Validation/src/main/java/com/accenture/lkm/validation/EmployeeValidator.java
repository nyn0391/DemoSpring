package com.accenture.lkm.validation;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmployeeValidator implements ConstraintValidator<EmployeeValidatorVal, String>{

	@Override
	public void initialize(EmployeeValidatorVal arg0) { //name of the related annotation
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String chasisNo, ConstraintValidatorContext arg1) {
		
		if(chasisNo==null){
			return false;
		}
		
		if (chasisNo.matches("[a-z]{3,}")) {
			return true;
		}else{
			return false;
		}
		
	}

}
