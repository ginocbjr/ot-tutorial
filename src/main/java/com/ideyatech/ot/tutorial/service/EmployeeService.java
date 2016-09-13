package com.ideyatech.ot.tutorial.service;

import java.util.Date;
import java.util.List;

import org.opentides.service.BaseCrudService;

import com.ideyatech.ot.tutorial.entity.Employee;

public interface EmployeeService extends BaseCrudService<Employee> {
	
	Employee findByEmailAddress(String email);
	
	List<Employee> findByFirstNameLike(String firstName);
	
	List<Employee> findBetweenBirthDate(Date startDate, Date endDate);
	
	Employee createTimesheet();

}
