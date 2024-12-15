package com.spring.cache.dto;

import lombok.Data;

/**
* @author Abhishek.Singh
* @spring_version 2.4.1
* @java_verison 1.8
*/
@Data
public class EmployeeDto {
	
	private Long empId;
	private String empName;
	private String empDesignation;
	private float empSalary;
}
