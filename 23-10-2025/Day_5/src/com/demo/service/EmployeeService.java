package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmp();

	boolean removeList();

	List<Employee> displayAll();

	List<Employee> sortById();

}
