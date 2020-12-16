package com.bridgelabz.employeepayrollapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {
	@Pattern(regexp = "^[A-Z]{1}[A-Za-z\\s]{2,}$", message = "Employee name invalid")
	public String name;
	@Min(value = 500, message = "Minimum Wage should be more than 500Rs")
	public long salary;

	public EmployeePayrollDTO(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "name: " + name + " salary: " + salary;
	}
}
