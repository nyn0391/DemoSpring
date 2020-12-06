package com.accenture.lkm.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import com.accenture.lkm.validation.EmployeeValidatorVal;

public class Employee {
	@EmployeeValidatorVal(message="Please Enter Valid Employee Name greater than Length 3")
	@NotEmpty(message="Employee Name is required Field") //cannot use not null for Sring as it returns "" from the page
	private String empoloyeeName;
	
	
	private Integer employeeId;
	
	@Range(min=10,max=100000,message="Message should be in Range of 10 and 100000")
	private double salary;
	
	@NotNull(message="Department is required Field")
	private Integer departmentCode;

	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empoloyeeName, Integer employeeId, double salary,
			Integer departmentCode) {
		super();
		this.empoloyeeName = empoloyeeName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.departmentCode = departmentCode;
	}

	public String getEmpoloyeeName() {
		return empoloyeeName;
	}

	public void setEmpoloyeeName(String empoloyeeName) {
		this.empoloyeeName = empoloyeeName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Integer getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(Integer departmentCode) {
		this.departmentCode = departmentCode;
	}

	@Override
	public String toString() {
		return "Employee [empoloyeeName=" + empoloyeeName + ", employeeId="
				+ employeeId + ", salary=" + salary + ", departmentCode="
				+ departmentCode + "]";
	}
	
	
}
