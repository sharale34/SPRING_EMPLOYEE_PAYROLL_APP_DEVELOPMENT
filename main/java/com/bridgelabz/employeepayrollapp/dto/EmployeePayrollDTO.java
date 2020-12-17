package com.bridgelabz.employeepayrollapp.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.ToString;

public @ToString class EmployeePayrollDTO {
	@Pattern(regexp = "^[A-Z]{1}[A-Za-z\\s]{2,}$", message = "Employee name invalid")
	public String name;

	@Min(value = 500, message = "Minimum Wage should be more than 500Rs")
	public long salary;

	@Pattern(regexp = "male|female", message = "Gender needs to either male or female")
	public String gender;

	@JsonFormat(pattern = "dd MMM yyyy")
	@NotNull(message = "startDate should Not be Empty")
	@PastOrPresent(message = "startDate should be past or today's date")
	public LocalDate startDate;

	@NotBlank(message = "Note cannot be Empty")
	public String note;

	@NotBlank(message = "ProfilePic cannot be Empty")
	public String profilePic;

	@NotNull(message = "department should not be Empty")
	public List<String> department;
}
