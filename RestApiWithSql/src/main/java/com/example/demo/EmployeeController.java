package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Details")
public class EmployeeController {
	
	
	
@Autowired
EmployeeService employeeService;
//public EmployeeController(EmployeeService employeeService) {
//		
//		this.employeeService = employeeService;
//	}




// read specific employee
@GetMapping("{EmpId}")
public EmployeeEntity getSingleDetails(@PathVariable("EmpId")Integer EmpId)
{
	return employeeService.getEmployeeEntity(EmpId);
}


//read all Employees
@GetMapping
public List<EmployeeEntity> getAllDetails()  
{
	return employeeService.getAllEmployeeEntity();
}

@PostMapping
public String createDetails(@RequestBody EmployeeEntity employeeEntity) 
{	
	employeeService.createEmployeeEntity(employeeEntity);
	return "created successfully";
}

@PutMapping
public String updateDetails(@RequestBody EmployeeEntity employeeEntity)
{
	employeeService.updateEmployeeEntity(employeeEntity);
	return "Updated Successfully";
}


@DeleteMapping("{EmpId}")
public String deleteDetails(@PathVariable("EmpId")Integer EmpId) 
{
	employeeService.deleteEmployeeEntity(EmpId);
	return "Deleted Successfully";
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
