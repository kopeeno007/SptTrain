package com.spt.training.domain;

import java.io.Serializable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.PreparedStatement;
import java.util.Set;


public class Countries implements Serializable {

	String countryId;
	Regions regionId;
	String countryName;

	Set<Locations> locations;



	
	public Countries(){
		
	}

	public Countries(String countryId,Regions regionId,String countryName,Set<Locations> locations){
		this.countryId = countryId;
		this.regionId = regionId;
		this.countryName = countryName;
		this.locations = locations;

	}

	public void setCountryId(String countryId){
		this.countryId = countryId;
	}

	public void setRegionId(Regions regionId){
		this.regionId = regionId;
	}

	public void setCountryName(String countryName){
		this.countryName = countryName;
	}

	public String getCountryId(){
		return countryId;
	}

	public Regions getRegionId(){
		return regionId;
	}

	public String getCountryName(){
		return countryName;
	}

	public String toString(){
		String ret = this.countryId+" "+this.regionId+" "+this.countryName;
		return ret;
	}

	public  void setLocations(Set<Locations> locations){
		this.locations = locations;
	}

	public Set<Locations> getLocations(){
		return locations;
	}


}