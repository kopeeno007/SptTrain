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

public class Main {
	public static void main(String[] args) {

/*		//===========================================

		RegionsDao regionsDao = new RegionsDao();
		Regions regions = new Regions();
		System.out.println(regionsDao.load(5));
		regions.setRegionId(6);
		regions.setRegionName("HELLO");
		regionsDao.create(regions);
		System.out.println(regionsDao.load(6));
		regions.setRegionId(6);
		regions.setRegionName("OK");
		regionsDao.update(regions);
		System.out.println(regionsDao.load(6));
		Regions re = new Regions();
		re.setRegionId(6);
		regionsDao.delete(re);

		//========================================================

		CountriesDao countriesDao = new CountriesDao();
		Countries countries = new Countries();
		System.out.println(countriesDao.load("DD"));
		//countries.setRegionId(6);
		//countries.setCountryId("FF");
		//countries.setCountryName("FIFI");
		//countriesDao.create(countries);
		System.out.println(countriesDao.load("FF"));
		countries.setRegionId(6);
		countries.setCountryName("FEFE");
		System.out.println(countriesDao.load("FF"));
		//countries.setCountryId("FF");
		//countriesDao.delete(countries);
		//System.out.println(countriesDao.load("FF"));

		//=======================================================

		LocationsDao locationsDao = new LocationsDao();
		Locations locations = new Locations();
		System.out.println(locationsDao.load(5000));
		locations.setLocationId(6000);
		locations.setStreetAddress("qwer");
		locations.setPostalCode("20000");
		locations.setCity("roiet");
		locations.setStateProvince("dio");
		locations.setCountryId("FF");
		locationsDao.create(locations);
		System.out.println(locationsDao.load(6000));
		locations.setLocationId(6000);
		locations.setStreetAddress("QQQQ");
		locations.setPostalCode("20000");
		locations.setCity("roietCity");
		locations.setStateProvince("dioppp");
		locations.setCountryId("FF");
		locationsDao.update(locations);
		System.out.println(locationsDao.load(6000));
		//locations.setLocationId(6000);
		//locationsDao.delete(locations);
		//System.out.println(locationsDao.load(6000));

		//======================================================

		DepartMentsDao departMentsDao = new DepartMentsDao();
		DepartMents departMents = new DepartMents();
		System.out.println(departMentsDao.load(34));
		departMents.setDepartMentsId(35);
		departMents.setDepartMentsName("ggg");
		departMents.setManagerId(7);
		departMents.setLocationId(6000);
		departMentsDao.create(departMents);
		System.out.println(departMentsDao.load(35));
		departMents.setDepartMentsId(35);
		departMents.setDepartMentsName("ggwp");
		departMents.setManagerId(7);
		departMents.setLocationId(6000);
		departMentsDao.update(departMents);
		System.out.println(departMentsDao.load(35));
		//departMents.setDepartMentsId(35);
		//departMentsDao.delete(departMents);

		//===========================================================

		JobsDao jobsDao = new JobsDao();
		Jobs jobs = new Jobs();
		System.out.println(jobsDao.load("R5R5"));
		jobs.setJobId("R1R1");
		jobs.setJobTitle("gggggg");
		jobs.setMinSalary(123);
		jobs.setMaxSalary(12345);
		jobsDao.create(jobs);
		System.out.println(jobsDao.load("R1R1"));
		jobs.setJobId("R5R5");
		jobs.setJobTitle("dddddd");
		jobs.setMinSalary(222);
		jobs.setMaxSalary(3333);
		jobsDao.update(jobs);
		System.out.println(jobsDao.load("R1R1"));
		//jobs.setJobId("R5R55");
		//jobsDao.delete(jobs);

		//============================================================

		EmployeesDao employeesDao = new EmployeesDao();
		Employees employees = new Employees();
		System.out.println(employeesDao.load(106));
		employees.setEmployeesId(107);
		employees.setFirstName("hoho");
		employees.setLastName("haha");
		employees.setEmail("EE@hok.com");
		employees.setPhoneNumber("1234543");
		Date hireDate = new Date(2013,12,12);
		employees.setHireDate(hireDate);
		employees.setJobId("R1R1");
		employees.setSalary(234);
		employees.setCommisstionPct(0);
		employees.setManagerId(103);
		employees.setDepartMentsId(35);
		employeesDao.create(employees);
		System.out.println(employeesDao.load(107));
		employees.setEmployeesId(107);
		employees.setFirstName("hoho");
		employees.setLastName("haha");
		employees.setEmail("EE@hok.com");
		employees.setPhoneNumber("1234543");
		Date hireDate2 = new Date(112,12,12);
		employees.setHireDate(hireDate2);
		employees.setJobId("R1R1");
		employees.setSalary(234);
		employees.setCommisstionPct(0);
		employees.setManagerId(103);
		employees.setDepartMentsId(35);
		employeesDao.update(employees);
		System.out.println(employeesDao.load(107));
		//employees.setEmployeesId(107);
		//employeesDao.delete(employees);
	
		//==================================================================

		JobhistoryDao jobhistoryDao = new JobhistoryDao();
		Jobhistory jobhistory = new Jobhistory();
		System.out.println(jobhistoryDao.load(106));
		jobhistory.setEmployeeId(107);
		Date startDate = new Date(112,12,23);
		Date endDate = new Date(113,11,23);
		jobhistory.setStartDate(startDate);
		jobhistory.setEndDate(endDate);
		jobhistory.setJobId("D");
		jobhistory.setDepartmentId(34);
		jobhistoryDao.create(jobhistory);
		System.out.println(jobhistoryDao.load(107));
		jobhistory.setEmployeeId(107);
		Date startDate2 = new Date(112,12,23);
		Date endDate2 = new Date(114,11,23);
		jobhistory.setStartDate(startDate2);
		jobhistory.setEndDate(endDate2);
		jobhistory.setJobId("G");
		jobhistory.setDepartmentId(34);
		jobhistoryDao.update(jobhistory);
		System.out.println(jobhistoryDao.load(107));
		jobhistory.setEmployeeId(107);
		//jobhistoryDao.delete(jobhistory);

		//====================================================================

		ProjectDao projectDao = new ProjectDao();
		Project project = new Project();
		System.out.println(projectDao.load(2));
		project.setProjectId(3);
		project.setProjectName("ASD");
		projectDao.create(project);
		System.out.println(projectDao.load(3));
		project.setProjectId(3);
		project.setProjectName("ASDDDD");
		projectDao.update(project);
		System.out.println(projectDao.load(3));
		project.setProjectId(3);
		//projectDao.delete(project);

		//======================================================================

		ProjectEmployeeDao projectEmployeeDao = new ProjectEmployeeDao();
		ProjectEmployee projectEmployee = new ProjectEmployee();
		System.out.println(projectEmployeeDao.load(2));
		projectEmployee.setProjectId(3);
		projectEmployee.setEmployeeId(102);
		//projectEmployeeDao.create(projectEmployee);
		System.out.println(projectEmployeeDao.load(3));
		projectEmployee.setProjectId(3);
		projectEmployee.setEmployeeId(104);
		projectEmployeeDao.update(projectEmployee);
		System.out.println(projectEmployeeDao.load(3));
		projectEmployee.setProjectId(3);
		//projectEmployeeDao.delete(projectEmployee);

		//=======================================================================

		StaffRoleDao staffRoleDao = new StaffRoleDao();
		StaffRole staffRole = new StaffRole();
		staffRole.setRoleId(1);
		staffRole.setRoleName("MMMMMM");
		//staffRoleDao.create(staffRole);
		System.out.println(staffRoleDao.load(1));
		staffRole.setRoleId(1);
		staffRole.setRoleName("hhhhh");
		staffRoleDao.update(staffRole);
		System.out.println(staffRoleDao.load(1));
		staffRole.setRoleId(1);
		//staffRoleDao.delete(staffRole);


		//===========================================================================================================
		RegionsDao regionsDao = new RegionsDao();
		Regions regions = new Regions();
		List<Regions> list = regionsDao.getAll();
		for(Regions r:list){
			System.out.println(r);
		}
		list = regionsDao.findByNameLike("A%");
		for(Regions r : list){
			System.out.println(r);
		}
		regions.setRegionId(1);
		regions.setRegionName("Asia");
		list = regionsDao.regionsByExample(regions);
		for(Regions r : list){
			System.out.println(r);
		}


		CountriesDao countriesDao = new CountriesDao();
		Countries countries = new Countries();
		List<Countries> listCount = countriesDao.getAll();
		for(Countries r:listCount){
			System.out.println(r);
		}

		List<Countries> listCountName = countriesDao.findByCountryNameLike("Uni%");
		for(Countries r:listCountName){
			System.out.println(r);
		}

		Regions reg = new Regions();
		RegionsDao regDao = new RegionsDao();
		reg.setRegionId(10);
		reg.setRegionName("Expo");
		reg.setCountries(new HashSet());
		reg.getCountries().add(new Countries("EP",10,"Epro"));
		regDao.create(reg);

		RegionsDao regionsDao1 = new RegionsDao();
		Regions regions1 = new Regions();
		List<Regions> regi = regionsDao1.getAll();
		for(Regions r:regi){
			System.out.println(r);
		}

		DepartMentsDao departMentsDao = new DepartMentsDao();
		DepartMents departMents = new DepartMents();
		List<DepartMents> depart = departMentsDao.getAll();
		for(DepartMents d : depart){
			System.out.println(d);
		}

		depart = departMentsDao.findByDepartMentsNameLike("Ma%");
		for(DepartMents d : depart){
			System.out.println(d);
		}
		departMents.setDepartMentsName("Marketing");
		depart = departMentsDao.regionsByExample(departMents);
		for(DepartMents d : depart){
			System.out.println(d);
		}


		EmployeesDao emDao = new EmployeesDao();
		Employees em = new Employees();
		List<Employees> employ = emDao.getAll();
		for(Employees emp : employ){
			System.out.println(emp);
		}
		employ = emDao.findByFirstNameLike("A%");
		for(Employees emp : employ){
			System.out.println(emp);
		}
		em.setLastName("SKING");
		employ = emDao.byExample(em);
		for(Employees emp : employ){
			System.out.println(emp);
		}
		

		JobhistoryDao jobhisDao = new JobhistoryDao();
		Jobhistory jobhis = new Jobhistory();
		List<Jobhistory> jhis = jobhisDao.getAll();
		for(Jobhistory jh : jhis){
			System.out.println(jh);
		}
		jhis = jobhisDao.findByJobIdLike("G%");
		for(Jobhistory jh : jhis){
			System.out.println(jh);
		}
		jobhis.setJobId("R");
		jhis = jobhisDao.byExample(jobhis);
		for(Jobhistory jh : jhis){
			System.out.println(jh);
		}

		JobsDao jobDao = new JobsDao();
		Jobs job = new Jobs();
		List<Jobs> jd = jobDao.getAll();
		for(Jobs jh : jd){
			System.out.println(jh);
		}
		jd = jobDao.findByJobTitleLike("A%");
		for(Jobs jh : jd){
			System.out.println(jh);
		}
		job.setMinSalary(10000);
		jd = jobDao.byExample(job);
		for(Jobs jh : jd){
			System.out.println(jh);
		}

		
		LocationsDao locatDao = new LocationsDao();
		Locations loct = new Locations();
		List<Locations> lo = locatDao.getAll();
		for(Locations jh : lo){
			System.out.println(jh);
		}
		lo = locatDao.findByPostalCodeLike("R%");
		for(Locations jh : lo){
			System.out.println(jh);
		}
		loct.setCity("Munich");
		lo = locatDao.byExample(loct);
		for(Locations jh : lo){
			System.out.println(jh);
		}

		ProjectDao proDao = new ProjectDao();
		Project pro = new Project();
		List<Project> pr = proDao.getAll();
		for(Project jh : pr){
			System.out.println(jh);
		}
		pr = proDao.findByProjectNameLike("%SD%");
		for(Project jh : pr){
			System.out.println(jh);
		}
		pro.setProjectName("RMS");
		pr = proDao.byExample(pro);
		for(Project jh : pr){
			System.out.println(jh);
		}


		ProjectEmployeeDao proemDao = new ProjectEmployeeDao();
		ProjectEmployee proem = new ProjectEmployee();
		List<ProjectEmployee> pree = proemDao.getAll();
		for(ProjectEmployee jh : pree){
			System.out.println(jh);
		}
		proem.setEmployeeId(100);
		pree = proemDao.byExample(proem);
		for(ProjectEmployee jh : pree){
			System.out.println(jh);
		}

		StaffRoleDao staffDao = new StaffRoleDao();
		StaffRole staff = new StaffRole();
		List<StaffRole> st = staffDao.getAll();
		for(StaffRole jh : st){
			System.out.println(jh);
		}
		st = staffDao.findByRoleNameLike("");
		for(StaffRole jh : st){
			System.out.println(jh);
		}
		staff.setRoleName("AAAA");
		st = staffDao.byExample(staff);
		for(StaffRole jh : st){
			System.out.println(jh);
		}
*/

	}
}