package com.Employeeapplication.Entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee {
	@Id @Column  private int empId;
	@Column private String empName;
	@Column private double empSal;
	
	public Employee()
	{
		
	}
  public Employee(int empId, String empName,double empSal) {
	  super();
	  this.empId = empId;
	  this.empName = empName;
	  this.empSal = empSal;
  }
  public int getEmpId() {
		 return empId;
	 }
	 public void SetEmpId(int empId) {
		 this.empId =  empId;
	 }
	 public String getEmpName() {
		 return empName;
	 }
	 public void SetEmpName(String empName) {
		 this.empName =  empName;
	 }
	 public double getEmpSal() {
		 return empSal;
	 }
	 public void SetEmpSal(double empSal) {
		 this.empSal =  empSal;
	 }
		
	

}
