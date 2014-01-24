package com.spt.training.domain;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.PreparedStatement;
import java.sql.Date;
import java.util.Set;

public class Employees implements Serializable{

	Integer employeesId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	Date hireDate;
	Jobs jobId;
	Integer salary;
	Integer commisstionPct;
	Integer managerId;
	DepartMents departMentsId;

	Set<Jobhistory> jobhistory;
	Set<Project> project;

	public Employees(){

	}

	public Employees(Integer employeesId,String firstName,String lastName,String email,String phoneNumber,
		Date hireDate,Jobs jobId,Integer salary,Integer commisstionPct,Integer managerId,DepartMents departMentsId){

		this.employeesId = employeesId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.commisstionPct = commisstionPct;
		this.managerId = managerId;
		this.departMentsId = departMentsId;

	}

	//acsetor

	public void setEmployeesId(Integer employeesId){
		this.employeesId = employeesId;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public void setHireDate(Date hireDate){
		this.hireDate = hireDate;
	}

	public void setJobId(Jobs jobId){
		this.jobId = jobId;
	}

	public void setSalary(Integer salary){
		this.salary = salary;
	}

	public void setCommisstionPct(Integer commisstionPct){
		this. commisstionPct = commisstionPct;
	}

	public void setManagerId(Integer managerId){
		this.managerId = managerId;
	}

	public void setDepartMentsId(DepartMents departMentsId){
		this.departMentsId = departMentsId;
	}

	public void setJobhistory(Set<Jobhistory> jobhistory){
		this.jobhistory = jobhistory;
	}
	public void setProject(Set<Project> project){
		this.project = project;
	}


	//mulator
	public Integer getEmployeesId(){
		return employeesId;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public String getEmail(){
		return email;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public Date getHireDate(){
		return hireDate;
	}

	public Jobs getJobId(){
		return jobId;
	}

	public Integer getSalary(){
		return salary;
	}

	public Integer getCommisstionPct(){
		return commisstionPct;
	}

	public Integer getManagerId(){
		return managerId;
	}

	public DepartMents getDepartMentsId(){
		return departMentsId;
	}

	public Set<Jobhistory> getJobhistory(){
		return jobhistory;
	}

	public Set<Project> getProject(){
		return project;
	}		


	//============================================================================================

	public String toString(){
		String ret = this.employeesId+" "+this.firstName+" "+this.lastName+" "+this.email+" "+this.phoneNumber+" "+this.hireDate+" "+this.jobId+" "+this.salary+" "+this.commisstionPct+" "+this.managerId+" "+this.departMentsId;
		return ret;
	}
	

}