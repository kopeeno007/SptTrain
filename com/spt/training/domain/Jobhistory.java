package com.spt.training.domain;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.PreparedStatement;
import java.sql.Date;

public class Jobhistory implements Serializable {

	Employees 	employeeId;
	Date 		startDate;
	Date 		endDate;
	Jobs 		jobId;
	DepartMents 	departmentId;

	public Jobhistory(){

	}

	public Jobhistory(Employees employeeId,Date startDate,Date endDate,Jobs jobId,DepartMents departmentId){

		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.jobId = jobId;
		this.departmentId = departmentId;

	}



	//acsetor
	public void setEmployeeId(Employees employeeId){
		this.employeeId = employeeId;
	}

	public void setStartDate(Date startDate){
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}

	public void setJobId(Jobs jobId){
		this.jobId = jobId;
	}

	public void setDepartmentId(DepartMents departmentId){
		this.departmentId = departmentId;
	}


	//mulator
	public Employees getEmployeeId(){
		return employeeId;
	}


	public Date getStartDate(){
		return startDate;
	}

	public  Date getEndDate(){
		return endDate;
	}

	public  Jobs getJobId(){
		return jobId;
	}

	public  DepartMents getDepartmentId(){
		return departmentId;
	}


	//===============================================

	public String toString(){
		String ret = this.employeeId+" "+this.startDate+" "+this.endDate+" "+this.jobId+" "+this.departmentId;
		return ret;
	}

}