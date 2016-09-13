package com.ideyatech.ot.tutorial.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.opentides.annotation.Auditable;
import org.opentides.bean.BaseEntity;
import org.opentides.web.json.Views;

import com.fasterxml.jackson.annotation.JsonView;

@Auditable
@Entity
@Table(name = "EMPLOYEE")
public class Employee extends BaseEntity {
	
	@JsonView(Views.SearchView.class)
	@Column(name = "FIRST_NAME")
	private String firstName;

	@JsonView(Views.SearchView.class)
	@Column(name = "MIDDLE_NAME")
	private String middleName;
	
	@JsonView(Views.SearchView.class)
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@JsonView(Views.SearchView.class)
	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTHDATE")
	private Date birthDate;
	
	@JsonView(Views.SearchView.class)
	@Column(name = "EMAIL_ADDRESS", unique = true)
	private String emailAddress;
	
	@Transient
	private Date startDate;
	
	@Transient
	private Date endDate;
	
	@Transient
	private Boolean isScenario1;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Boolean getIsScenario1() {
		return isScenario1;
	}
	
	public void setIsScenario1(Boolean isScenario1) {
		this.isScenario1 = isScenario1;
	}
	
}
