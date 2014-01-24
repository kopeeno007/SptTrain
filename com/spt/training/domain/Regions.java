package com.spt.training.domain;

import java.io.Serializable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.PreparedStatement;
import java.util.Set;

public class Regions implements Serializable {

	Integer regionId;
	String	regionName;

	Set<Countries> countries;


	public Regions(){

	}

	//acsetor

	public void setRegionId(Integer regionId){
		this.regionId = regionId;
	}

	public void setRegionName(String regionName){
		this.regionName = regionName;
	}

	//mulator
	public Integer getRegionId(){
		return regionId;
	}


	public String getRegionName(){
		return regionName;
	}

	public String toString(){
		String ret = this.regionId+" "+this.regionName;
		return ret;
	}

	public  void setCountries(Set<Countries> countries){
		this.countries = countries;
	}

	public Set<Countries> getCountries(){
		return countries;
	}

	
}