package com.demo.test;
import java.util.*;
import com.demo.service.*;
import com.demo.beans.*;
public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eserv=new EmployeeServiceImpl();
		int choice=0;
		
		do {
			
			System.out.println("1.Add new Employee \n2.Remove Employee List\n3.Show all Employee\n4.Sort on the basis of empID");
			System.out.println("5.Find a Employee with empName\n6.Save all Employees into file\n7.Quit\nChoice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1->{
				
				boolean status=eserv.addNewEmp();
				if(status) {
					System.out.println("Added successfully");
				}else {
					System.out.println("Not added");
				}
				
			}
			
			case 2->{
				boolean status=eserv.removeList();
				if(status) {
					System.out.println("removed successfully");
				}else {
					System.out.println("not removed");
				}
			}
			case 3->{
				List<Employee> e=eserv.displayAll();
				e.forEach(System.out::println);
				
			}
			case 4->{
				List <Employee>elist=eserv.sortById();
				elist.forEach(System.out::println);
				
			}
			case 5->{
				System.out.println("enter name to search");
				String nm=sc.next();
				List<Employee>lst=eserv.findByName(nm);
				if(lst!=null) {
					lst.forEach(System.out::println);
				}else {
					System.out.println("not found");
				}
			}
			case 6->{
				 boolean status = eserv.saveToFile();
				    if(status) {
				        System.out.println("File saved successfully.");
				    } else {
				        System.out.println("Failed to save file.");
				    }
				
			}
			case 7->{
				System.out.println("Thanks for visiting");
				
			}
			default->{
				System.out.println("Wrong Choice");
			}
			}
			
		}while(choice!=10);

	}

}
