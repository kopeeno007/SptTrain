package com.spt.training.domain;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.PreparedStatement;
import java.sql.Date;

public class StaffRole implements Serializable {

	Integer 	roleId;
	String		roleName;

	public StaffRole(){

	}



	//acsetor
	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}

	public void setRoleName(String roleName){
		this.roleName = roleName;
	}


	//mulator
	public Integer getRoleId(){
		return roleId;
	}


	public String getRoleName(){
		return roleName;
	}

	public String toString(){
		String ret = this.roleId+" "+this.roleName;
		return ret;
	}



}