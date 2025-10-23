package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	

	boolean save(Employee e);

	boolean removeList();

	List<Employee> display();

	List<Employee> sortById();

	List<Employee> searchByName(String nm);

	boolean saveFile();

}
