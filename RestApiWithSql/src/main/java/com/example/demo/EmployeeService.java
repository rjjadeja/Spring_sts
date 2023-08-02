package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	
@Autowired

EmployeeRepository employeeRepository;
//public EmployeeService(EmployeeRepository employeeRepository) {
//		
//		this.employeeRepository = employeeRepository;
//		
//	}


public String createEmployeeEntity(EmployeeEntity employeeEntity) 
{
	 employeeRepository.save(employeeEntity);
	 return "success";
}


public String updateEmployeeEntity(EmployeeEntity employeeEntity)
{
	 employeeRepository.save(employeeEntity);
	 return "success";
}


public String deleteEmployeeEntity(Integer EmpId) 
{
	employeeRepository.deleteById(EmpId);
	return "success";
}


public List<EmployeeEntity> getAllEmployeeEntity()
{
	return employeeRepository.findAll();
}
public EmployeeEntity getEmployeeEntity(Integer EmpId)
{
	return employeeRepository.findById(EmpId).get();
}











}
