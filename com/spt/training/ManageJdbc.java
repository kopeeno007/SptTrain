package com.spt.training;

import com.spt.training.domain.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.PreparedStatement;
import java.sql.Date;

public class ManageJdbc {

	public static void main(String[] args){


		Regions regions = new Regions();
	   	//regions.selectDB();
	   	//regions.setRegions(5,"SANOOOO");
	   	//regions.insertDB();
	   	//regions.selectDB();
	   	//regions.updateDB(5,"R5R5");
	   	//regions.selectDB();
	   	//regions.deleteDB(5);
	   	//regions.selectDB();

	   	//==================================================

	   	Countries countries = new Countries();
	   	//countries.selectDB();
	   	//countries.setCountry(5,"DD","dendi");
	   	//countries.insertDB();
	   	//countries.selectDB();
	   	//countries.updateDB(5,"dd");
	   	//countries.selectDB();
	   	//countries.deleteDB(5);
	   	//countries.selectDB();

	   	//===================================================


	   	Locations locations = new Locations();
		locations.selectDB();
		//public void setLocations(int locationId,String streetAddress,String postalCode,String city,String stateProvince,String countryId)
		//locations.setLocations(5000,"assssdf","eee","rrrhhh","rtttt","DD");
		//locations.insertDB();
		locations.selectDB();
		//public void updateDB(String streetAddress,String postalCode,String city,int locationId)
		locations.updateDB("R5R5","R5R5","R5R5",5000);
		//locations.selectDB();
		//locations.deleteDB(4000);
		locations.selectDB();

		//=====================================================

		DepartMents departMents = new DepartMents();
		//departMents.selectDB();
		//departMents.setDepartMents(34,"hhh",6,5000);
		//departMents.insertDB();
		//departMents.selectDB();
		//departMents.updateDB(34,55);
		//departMents.selectDB();
		//departMents.deleteDB(34);
		departMents.selectDB();

		//===================================================

		Jobs jobs = new Jobs();
		//jobs.selectDB();
		//jobs.setJobs("R","R5",1234,12345);
		//jobs.insertDB();
		jobs.selectDB();
		//public void updateDB(int minSalary,int maxSalary, String jobId)
		jobs.updateDB(123,1234,"R");
		jobs.selectDB();
		jobs.deleteDB("R");
		jobs.selectDB();

		//======================================================================

		


		Employees employees = new Employees();
		employees.selectDB();
		//public void setEmployees(int employeesId,String firstName,String lastName,String email,String phoneNumber,
		//Date hireDate,String jobId,int salary,int commisstionPct,int managerId,int departMentsId)
		Date a = new Date(2013,07,05);
		//employees.setEmployees(106,"APT","EAK","kkk@gmail.com","590.423.4568",a,"R5R5",3000,0,103,34);
		//employees.insertDB();
		employees.selectDB();
		employees.updateDB("1234567",106);
		employees.selectDB();




		//====================================================

		Jobhistory jobhistory = new Jobhistory();
		jobhistory.selectDB();

		Date start = new Date(1012,12,10);
		Date end = new Date(1013,12,10);
		jobhistory.setJobhistory(106,start,end,"R",34);
		jobhistory.insertDB();
		jobhistory.selectDB();
		//jobhistory.deleteDB(106);
		//jobhistory.selectDB();

		//========================================================

		Project project = new Project();
		project.selectDB();
		project.setProject(99,"r5r5");
		project.insertDB();
		project.selectDB();
		project.updateDB("www",99);
		project.selectDB();
		project.deleteDB(99);
		project.selectDB();

		//==========================================================

		ProjectEmployee projectEmployee = new ProjectEmployee();
		projectEmployee.selectDB();
		projectEmployee.setProjectEmployee(5,5);
		projectEmployee.insertDB();
		projectEmployee.selectDB();
		projectEmployee.updateDB(6,5);
		projectEmployee.selectDB();
		projectEmployee.deleteDB(5);
		projectEmployee.selectDB();

		StaffRole staffRole = new StaffRole();
		staffRole.selectDB();
		staffRole.setStaffRole(1,"R5R5");
		staffRole.insertDB();
		staffRole.selectDB();
		staffRole.updateDB("www",1);
		staffRole.selectDB();
		staffRole.deleteDB(1);
		staffRole.selectDB();
		



	}
}