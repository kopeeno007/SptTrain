package com.spt.training.domain;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.PreparedStatement;
import java.sql.Date;
import java.util.Set;


public class DepartMents implements Serializable {

	Integer departMentsId;
	String departMentsName;
	Integer managerId;
	Locations locationId;

	Set<Employees> employees;
	Set<Jobhistory> jobhistory;
	
	

	public DepartMents() {

	}


	public DepartMents(Integer departMentsId,String departMentsName,Integer managerId,Locations locationId){

		this.departMentsId = departMentsId;
		this.departMentsName = departMentsName;
		this.managerId = managerId;
		this.locationId = locationId;

	}


	//acsetor

	public void setDepartMentsId(Integer departMentsId){
		this.departMentsId = departMentsId;
	}

	public void setDepartMentsName(String departMentsName){
		this.departMentsName = departMentsName;
	}

	public void setManagerId(Integer managerId){
		this.managerId = managerId;
	}

	public void setLocationId(Locations locationId){
		this.locationId = locationId;
	}

	//mulator
	public Integer getDepartMentsId(){
		return departMentsId;
	}

	public String getDepartMentsName(){
		return departMentsName;
	}

	public Integer getManagerId(){
		return managerId;
	}

	public Locations getLocationId(){
		return locationId;
	}

	public void setEmployees(Set<Employees> employees){
		this.employees = employees;
	}
	
	public Set<Employees> getEmployees(){
		return employees;
	}

	public void setJobhistory(Set<Jobhistory> jobhistory){
		this.jobhistory = jobhistory;
	}
	
	public Set<Jobhistory> getJobhistory(){
		return jobhistory;
	}



	//=============================================================================================
	
	public String toString(){
		String ret = this.departMentsId+" "+this.departMentsName+" "+this.managerId+" "+this.locationId;
		return ret;
	}


}