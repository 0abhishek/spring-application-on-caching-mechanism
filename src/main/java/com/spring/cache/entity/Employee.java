package com.spring.cache.entity;

import lombok.Data;

/**
 * @author Abhishek.Singh
 * @spring_version 2.4.1
 * @java_verison 1.8
 */

@Data
public class Employee {

	private Long empId;
	private String empName;
	private String empDesignation;
	private float empSalary;
}
