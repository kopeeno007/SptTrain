package com.spt.training.domain;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.PreparedStatement;
import java.sql.Date;
import java.util.Set;

public class Locations implements Serializable {

	Integer locationId;
	String 	streetAddress;
	String 	postalCode;
	String 	city;
	String 	stateProvince;
	Countries 	countryId;

	Set<DepartMents> departMents;

	public Locations(){

	}

	public Locations(Integer locationId,String streetAddress,String postalCode,String city,String stateProvince,Countries countryId){
		this.locationId = locationId;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.city = city;
		this.stateProvince = stateProvince;
		this.countryId = countryId;

	}

	//acsetor
	public void setLocationId(Integer locationId){
		this.locationId = locationId;
	}

	public void setStreetAddress(String streetAddress){
		this.streetAddress = streetAddress;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public void setCity(String city){
		this.city = city;
	}

	public void setStateProvince(String stateProvince){
		this.stateProvince = stateProvince;
	}

	public void setCountryId(Countries countryId){
		this.countryId = countryId;
	}

	//mulator
	public Integer getLocationId(){
	 	return locationId;
	}

	public String getStreetAddress(){
		return streetAddress;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public String getCity(){
		return city;
	}

	public String getStateProvince(){
		return stateProvince;
	}

	public Countries getCountryId(){
		return countryId;
	}

	public String toString(){
		String ret = this.locationId+" "+this.streetAddress+" "+this.postalCode+" "+this.city+" "+this.stateProvince+" "+this.countryId;
		return ret;
	}

	public void setDepartMents(Set<DepartMents> departMents){
		this.departMents = departMents;
	}
	public Set<DepartMents> getDepartMents(){
		return departMents;
	}

}