package com.demo.beans;

public class Employee implements Comparable<Employee>{
	private String EmpName;
	private int EmpId;
	private String EmpRole;
	
	public Employee() {
		super();
	}

	public Employee(String empName, int empId, String empRole) {
		super();
		EmpName = empName;
		EmpId = empId;
		EmpRole = empRole;
	}
	
	public Employee(String empName, int empId) {
		super();
		EmpName = empName;
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpRole() {
		return EmpRole;
	}
	public void setEmpRole(String empRole) {
		EmpRole = empRole;
	}
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpId=" + EmpId + ", EmpRole=" + EmpRole + "]";
	}

	@Override
	public int compareTo(Employee o) {
	     // TODO Auto-generated method stub
		return Integer.compare(this.EmpId, o.EmpId);
	}
	
	

}
