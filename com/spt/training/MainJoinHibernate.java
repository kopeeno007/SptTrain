package com.spt.training;

import org.apache.log4j.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.spt.training.domain.*;
import com.spt.training.daoClass.*;
import java.util.List;
import java.sql.Date;
import java.util.HashSet;

public class MainJoinHibernate{
	public static void main(String[] args){


		//=======================Regions >> Countries===============================================

		// RegionsDao reDao = new RegionsDao();
		// Regions re = new Regions();
		// re.setRegionId(7);
		// re.setRegionName("GreenLand");

		// HashSet<Countries> hasCoun = new HashSet<Countries>();
		// hasCoun.add(new Countries("GL",re,"Gele",null));

		// re.setCountries(hasCoun);
		

		// //reDao.create(re);

		// List<Regions> list2 = reDao.getAll();
		// for(Regions r:list2){
		// 	System.out.println(r);
		// }
		
		//=========================Locations >> DepartMents==============================================

		// LocationsDao locaDao = new LocationsDao();
		// Locations loca = new Locations();

		// CountriesDao counDao = new CountriesDao();
		// Countries coun = counDao.load("GL");
		// counDao.closeSession();

		// loca.setLocationId(7000);
		// loca.setStreetAddress("ASWTW");
		// loca.setPostalCode("HIHJK");
		// loca.setCity("IOPU");
		// loca.setStateProvince("QTQT");
		// loca.setCountryId(coun);

		// HashSet<DepartMents> hashDepart = new HashSet<DepartMents>();
		// hashDepart.add(new DepartMents(36,"BANTU",29,loca));

		// loca.setDepartMents(hashDepart);
		// locaDao.create(loca);


		//===================== Employees ======================================================
		
		// EmployeesDao empDao = new EmployeesDao();
		// Employees emp = new Employees();
		// emp.setEmployeesId(108);
		// emp.setFirstName("Am");
		// emp.setLastName("VAVA");
		// emp.setEmail("FFF@GGG.ggg");
		// emp.setPhoneNumber("0102938");
		// Date hDate = new Date(112,11,11);
		// emp.setHireDate(hDate);
		// emp.setJobId("H");
		// emp.setSalary(12345);
		// emp.setCommisstionPct(null);
		// emp.setManagerId(null);

		// DepartMentsDao depEmDao = new DepartMentsDao();
		// DepartMents depEm = depEmDao.load(35);
		// depEmDao.closeSession();
		// emp.setDepartMentsId(depEm);

		// HashSet<Jobhistory> hashJohi = new HashSet<Jobhistory>();
		// Date hDate1 = new Date(111,11,11);
		// Date hDate2 = new Date(112,11,11);


		// hashJohi.add(new Jobhistory(emp,hDate1,hDate2,"H",35));
		// emp.setJobhistory(hashJohi);

		// empDao.create(emp);



		//===============================================================================

		// JobsDao jobsDao = new JobsDao();
		// Jobs jobs = new Jobs();
		// jobs.setJobId("Z");
		// jobs.setJobTitle("What");
		// jobs.setMinSalary(18000);
		// jobs.setMaxSalary(50000);


		// HashSet<Employees> hashEmployees = new HashSet<Employees>();
		// Employees emp = new Employees();

		// emp.setEmployeesId(108);
		// emp.setFirstName("Am");
		// emp.setLastName("VAVA");
		// emp.setEmail("FFF@GGG.ggg");
		// emp.setPhoneNumber("0102938");
		// Date hDate = new Date(112,11,11);
		// emp.setHireDate(hDate);
		// emp.setJobId(jobs);
		// emp.setSalary(12345);
		// emp.setCommisstionPct(null);
		// emp.setManagerId(null);
		// DepartMentsDao depEmDao = new DepartMentsDao();
		// DepartMents depEm = depEmDao.load(35);
		// depEmDao.closeSession();
		// emp.setDepartMentsId(depEm);

		// hashEmployees.add(emp);

		// jobs.setEmployees(hashEmployees);

		// //jobsDao.create(jobs);



		
		

		//===============================================================================

		JobhistoryDao jobhistoryDao = new JobhistoryDao();
		Jobhistory jobhistory = new Jobhistory();

		EmployeesDao empDao = new EmployeesDao();
		Employees emp = empDao.load(108);
		empDao.closeSession();

		jobhistory.setEmployeeId(emp);

		Date hDate1 = new Date(11,11,11);
		Date hDate2 = new Date(112,11,11);

		jobhistory.setStartDate(hDate1);
		jobhistory.setEndDate(hDate2);

		JobsDao jobsDao = new JobsDao();
		Jobs jobs = jobsDao.load("Z");
		jobsDao.closeSession();

		jobhistory.setJobId(jobs);

		DepartMentsDao departMentsDao = new DepartMentsDao();
		DepartMents depart = departMentsDao.load(35);

		System.out.println(depart);

		//jobhistory.setDepartmentId(depart);

		//jobhistoryDao.create(jobhistory);



	}
}