package com.demo.dao;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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

   @Override
   public List<Employee> searchByName(String nm) {
	List<Employee>lst=new ArrayList<>();
	for(Employee e:elist) {
		if(e.getEmpName().equals(nm)) {
			lst.add(e);
		}
	}
	return lst;
   }

   @Override
   public boolean saveFile() {
	List<Employee>lst=elist;
	if(lst.isEmpty()) {
		System.out.println("No employees to save");
		return false;
	}
	try(BufferedWriter bw=new BufferedWriter(new FileWriter("emp.txt"))){
		
		for(Employee e:lst) {
			bw.write(e.getEmpName()+" "+e.getEmpId()+" "+e.getEmpRole());
			bw.newLine();
		}
		return true;
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	
	
   }
	
	

}
