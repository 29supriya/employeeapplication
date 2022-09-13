package com.Employeeapplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employeeapplication.Entity.Employee;
import com.Employeeapplication.Service.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
private EmployeeService empService;

@GetMapping("/employees")
public List<Employee> employeeList(){
	return empService.getAllEmployees();
}

@GetMapping("/employee/{id}")
public Employee getById(@PathVariable(value="id")int id){
	return empService.getEmployee(id);
}

@PostMapping("/addemployee")
public String add(@RequestBody Employee e) {
return empService.addEmployee(e);
}

@PutMapping("/updateemployeebyid/{id}/{name}")
public String update(@PathVariable(value="id")int id,@PathVariable(value="name")String name) {
	return empService.updateName(id, name);
}

@PutMapping("/updateemployeebyid/{id}/{salary}")
public String update(@PathVariable(value="id")int id,@PathVariable(value="salary")double salary) {
	return empService.updateSalary(id, salary);
}

@DeleteMapping("/deletemployee/{id}")
public String delete(@PathVariable(value="id") int id) {
	return empService.deleteEmployee(id);
	
}
}








