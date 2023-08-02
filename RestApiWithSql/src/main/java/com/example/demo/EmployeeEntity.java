package com.example.demo;

//import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table

public class EmployeeEntity {
@Id
//@Generated(value = { "" })
private int empId;

@Column
private String empName;

public EmployeeEntity(int empId, String empName, int empSalary, String empCity) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
	this.empCity = empCity;
}





@Column
private int  empSalary;

@Column
private String empCity;


public int getEmpId() {
	return empId;
}


public void setEmpId(int empId) {
	this.empId = empId;
}


public String getEmpName() {
	return empName;
}


public void setEmpName(String empName) {
	this.empName = empName;
}


public int getEmpSalary() {
	return empSalary;
}


public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}


public String getEmpCity() {
	return empCity;
}


public void setEmpCity(String empCity) {
	this.empCity = empCity;
}


public EmployeeEntity() {
	super();
	// TODO Auto-generated constructor stub
}





@Override
public String toString() {
	return "EmployeeEntity [EmpId=" + empId + ", EmpName=" + empName + ", EmpSalary=" + empSalary + ", EmpCity="
			+ empCity + "]";
}

	








	
}
