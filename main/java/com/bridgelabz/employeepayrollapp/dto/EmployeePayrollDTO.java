package com.bridgelabz.employeepayrollapp.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.ToString;

public @ToString class EmployeePayrollDTO {
	@Pattern(regexp = "^[A-Z]{1}[A-Za-z\\s]{2,}$", message = "Employee name invalid")
	public String name;
	@Min(value = 500, message = "Minimum Wage should be more than 500Rs")
	public long salary;

	public String gender;

	@JsonFormat(pattern = "dd MMM yyyy")
	public LocalDate startDate;

	public String note;

	public String profilePic;

	public List<String> departments;
}
