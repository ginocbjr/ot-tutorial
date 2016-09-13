package com.ideyatech.ot.tutorial.dao;

import java.util.Date;
import java.util.List;

import org.opentides.dao.BaseEntityDao;

import com.ideyatech.ot.tutorial.entity.Employee;

public interface EmployeeDao extends BaseEntityDao<Employee, Long> {
	
	Employee findByEmailAddress(String email);
	
	List<Employee> findByFirstNameLike(String firstName);
	
	List<Employee> findBetweenBirthDate(Date startDate, Date endDate);

}
