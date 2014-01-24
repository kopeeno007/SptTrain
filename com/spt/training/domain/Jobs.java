package com.spt.training.domain;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.PreparedStatement;
import java.sql.Date;
import java.util.Set;

public class Jobs implements Serializable {

	String	jobId;
	String	jobTitle;
	Integer 	minSalary;
	Integer 	maxSalary;

	Set<Jobhistory> jobhistory;
	Set<Employees> employees;

	public Jobs(){

	}

	public Jobs(String jobId,String jobTitle,Integer minSalary,Integer maxSalary){
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	

	//acsetor
	public void setJobId(String jobId){
		this.jobId = jobId;
	}

	public void setJobTitle(String jobTitle){
		this.jobTitle = jobTitle;
	}

	public void setMinSalary(Integer minSalary){
		this.minSalary = minSalary;
	}
	public void setMaxSalary(Integer maxSalary){
		this.maxSalary = maxSalary;
	}
	public void setEmployees(Set<Employees> employees){
		this.employees = employees;
	}


	//mulator
	public String getJobId(){
		return jobId;
	}


	public String getJobTitle(){
		return jobTitle;
	}

	public  Integer getMinSalary(){
		return minSalary;
	}

	public  Integer getMaxSalary(){
		return maxSalary;
	}

	public void setJobhistory(Set<Jobhistory> jobhistory){
		this.jobhistory = jobhistory;
	}

	public Set<Jobhistory> getJobhistory(){
		return jobhistory;
	}

	public Set<Employees> getEmployees(){
		return employees;
	}

	public String toString(){
		String ret = this.jobId+" "+this.jobTitle+" "+this.minSalary+" "+this.maxSalary;
		return ret;
	}

}