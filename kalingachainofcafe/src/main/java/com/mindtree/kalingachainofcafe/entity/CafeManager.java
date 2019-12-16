package com.mindtree.kalingachainofcafe.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="cafe_manager")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="managerId")
public class CafeManager {
@Id
@Column(name="manager_id")
private int managerId;
@Column(name="manager_name")
private String managerName;
@Column(name="manager_salary")
private double managerSalary;

@OneToMany(mappedBy="cafe",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
private List<Cafe> cafe;

public int getManagerId() {
	return managerId;
}

public void setManagerId(int managerId) {
	this.managerId = managerId;
}

public String getManagerName() {
	return managerName;
}

public void setManagerName(String managerName) {
	this.managerName = managerName;
}

public double getManagerSalary() {
	return managerSalary;
}

public void setManagerSalary(double managerSalary) {
	this.managerSalary = managerSalary;
}

public List<Cafe> getCafe() {
	return cafe;
}

public void setCafe(List<Cafe> cafe) {
	this.cafe = cafe;
}

public CafeManager() {
	super();
}


}
