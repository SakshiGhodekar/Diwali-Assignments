package com.demo.dao;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.*;
public class EmployeeDaoImpl implements EmployeeDao{
   static List<Employee>elist;
   
   static {
	   elist=new ArrayList<>();
	   elist.add(new Employee("sakshi",1,"admin"));
	   elist.add(new Employee("payal",2,"hr"));
   }

   @Override
   public boolean save(Employee e) {
	
	return elist.add(e);
   }

   @Override
   public boolean removeList() {
	// TODO Auto-generated method stub
	return elist.removeAll(elist);
   }

   @Override
   public List<Employee> display() {
	// TODO Auto-generated method stub
	return elist;
   }

   @Override
   public List<Employee> sortById() {
	 List<Employee>lst=new ArrayList<>();
	 for(Employee e:elist) {
		 lst.add(e);
	 }
	 lst.sort(null);
	return lst;
   }
	
	

}
