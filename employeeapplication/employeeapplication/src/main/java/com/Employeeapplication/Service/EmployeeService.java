package com.Employeeapplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employeeapplication.Entity.Employee;
import com.Employeeapplication.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository empRepository;
	public List<Employee> getAllEmployees(){
		return empRepository.findAll();
	}
	public Employee getEmployee(int id) {
		Employee e= empRepository.findById(id).get();
		if(e!=null) {
			return e;
			
		}
		return null;
			
		}
	
	public String addEmployee(Employee e) {
		empRepository.save(e);
		return "employee inserted successfully";
	}
     
     
     public String updateName(int id,String name) {
    	 Employee e =empRepository.findById(id).get();
    	 if(e!=null) {
    		 e.SetEmpName(name);
    		 empRepository.save(e);
    		 return "Record updated successfully";
    	 }
    	 else
    		 return null;
     }
     public String updateSalary(int id,double salary) {
    	 Employee e =empRepository.findById(id).get();
    	 if(e!=null) {
    		 e.SetEmpSal(salary);
    		 empRepository.save(e);
    		 return "Record updated successfully";
    	 }
    	 else
    		 return null;
     }

     public String deleteEmployee(int id) {
    	Employee  e =empRepository.findById(id).get();
    	 if(e!=null) {
    		  empRepository.deleteById(id);
    		 return "Record deleted successfully";
    	 }
    	 else
    		 return null;
     }
     }
     
     
     
     
     
     
     
     
     
     
     
     
    		 
    		 
    		 
    		 
    		 
     

