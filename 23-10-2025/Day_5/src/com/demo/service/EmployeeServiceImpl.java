package com.demo.service;
import com.demo.dao.*;
import com.demo.beans.*;
import java.util.*;
public class EmployeeServiceImpl implements EmployeeService {
		private EmployeeDao edao;

public EmployeeServiceImpl() {
	edao=new EmployeeDaoImpl();
}

@Override
public boolean addNewEmp() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter employee name");
	 String ename=sc.next();
	 System.out.println("enter eId");
	 int id=sc.nextInt();
	 System.out.println("Enter emp role");
	 String role=sc.next();
	 Employee e=new Employee(ename,id,role);
	return edao.save(e);
}

@Override
public boolean removeList() {
	// TODO Auto-generated method stub
	return edao.removeList();
}

@Override
public List<Employee> displayAll() {
	// TODO Auto-generated method stub
	return edao.display();
}

@Override
public List<Employee> sortById() {
	// TODO Auto-generated method stub
	return edao.sortById();
}

@Override
public List<Employee> findByName(String nm) {
	// TODO Auto-generated method stub
	return edao.searchByName(nm);
}

@Override
public boolean saveToFile() {
	// TODO Auto-generated method stub
	return edao.saveFile();
}


}
