package com.ideyatech.ot.tutorial.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.opentides.dao.impl.BaseEntityDaoJpaImpl;
import org.springframework.stereotype.Repository;

import com.ideyatech.ot.tutorial.dao.EmployeeDao;
import com.ideyatech.ot.tutorial.entity.Employee;

@Repository(value = "employeeDao")
public class EmployeeDaoJpaImpl extends BaseEntityDaoJpaImpl<Employee, Long> 
	implements EmployeeDao {

	@Override
	public Employee findByEmailAddress(String email) {
		Map<String, Object> params = new HashMap<>();
		params.put("email", email);
		return findSingleResultByNamedQuery("jpql.employee.findByEmail", params);
	}

	@Override
	public List<Employee> findByFirstNameLike(String firstName) {
		Map<String, Object> params = new HashMap<>();
		params.put("firstName", "%" + firstName + "%");
		return findByNamedQuery("jpql.employee.findByFirstNameLike", params);
	}

	@Override
	public List<Employee> findBetweenBirthDate(Date startDate, Date endDate) {
		Employee sample = new Employee();
		sample.setIsScenario1(true);
		sample.setStartDate(startDate);
		sample.setEndDate(endDate);
		return findByExample(sample);
	}
	
	@Override
	protected String appendClauseToExample(Employee example, boolean exactMatch) {
		StringBuilder sb = new StringBuilder();
		if(example.getStartDate() != null && example.getEndDate() != null) {
			sb.append(" obj.birthDate >= :startDate ");
			sb.append(" and ");
			sb.append(" obj.birthDate <= :endDate ");
		}
		return sb.toString();
	}

}
