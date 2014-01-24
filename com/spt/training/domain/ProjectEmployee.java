package com.spt.training.domain;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.PreparedStatement;
import java.sql.Date;

public class ProjectEmployee implements Serializable {

	Integer 	projectId;
	Integer		employeeId;

	public ProjectEmployee(){

	}

	public ProjectEmployee(Integer projectId,Integer employeeId){

		this.projectId = projectId;
		this.employeeId = employeeId;

	}



	//acsetor
	public void setProjectId(Integer projectId){
		this.projectId = projectId;
	}

	public void setEmployeeId(Integer employeeId){
		this.employeeId = employeeId;
	}


	//mulator
	public Integer getProjectId(){
		return projectId;
	}


	public Integer getEmployeeId(){
		return employeeId;
	}

	public String toString(){
		String ret = this.projectId+" "+this.employeeId;
		return ret;
	}

}