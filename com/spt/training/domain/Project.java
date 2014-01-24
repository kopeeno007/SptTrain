package com.spt.training.domain;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.PreparedStatement;
import java.sql.Date;
import java.util.Set;


public class Project implements Serializable {

	Integer 	projectId;
	String		projectName;

	Set<Employees> employees;

	public Project(){

	}

	public Project(Integer projectId,String projectName){

		this.projectId = projectId;
		this.projectName = projectName;

	}



	//acsetor
	public void setProjectId(Integer projectId){
		this.projectId = projectId;
	}

	public void setProjectName(String projectName){
		this.projectName = projectName;
	}

	public void setEmployees(Set<Employees> employees){
		this.employees = employees;
	}


	//mulator
	public Integer getProjectId(){
		return projectId;
	}


	public String getProjectName(){
		return projectName;
	}

	public Set<Employees> getEmployees(){
		return employees;
	}


	public String toString(){
		String ret = this.projectId+" "+this.projectName;
		return ret;
	}

}