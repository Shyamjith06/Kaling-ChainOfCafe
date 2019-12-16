package com.mindtree.kalingachainofcafe.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="cafe")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="cafeId")
public class Cafe {
	@Id
	@Column(name="cafe_id")
	private int cafeId;
	@Column(name="cafe_name")
	private String cafeName;
	@Column(name="cafe_revenue")
	private double cafeRevenue;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private CafeManager manager;
	public int getCafeId() {
		return cafeId;
	}
	public void setCafeId(int cafeId) {
		this.cafeId = cafeId;
	}
	public String getCafeName() {
		return cafeName;
	}
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}
	public double getCafeRevenue() {
		return cafeRevenue;
	}
	public void setCafeRevenue(double cafeRevenue) {
		this.cafeRevenue = cafeRevenue;
	}
	public CafeManager getManager() {
		return manager;
	}
	public void setManager(CafeManager manager) {
		this.manager = manager;
	}
	
	public Cafe() {
		super();
	}
	
	


}
