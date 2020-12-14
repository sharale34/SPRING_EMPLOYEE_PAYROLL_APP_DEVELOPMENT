package com.bridgelabz.employeepayrollapp.services;

import java.util.List;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {

	List<EmployeePayrollData> getEmployeePayrollData();

	EmployeePayrollData getEmployeePayrollData(int empId);

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeeDTO);

	void deleteEmployeePayrollData(int empId);
}