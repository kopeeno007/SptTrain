package com.spt.training.daoClass;
import org.apache.log4j.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import com.spt.training.domain.*;
import com.spt.training.daoClass.*;
import java.util.List;
import com.spt.training.*;
import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.criterion.*;

public class EmployeesDao {

	Session session = HibernateTrain.getSession();

	public EmployeesDao() {

	}

	public void create(Employees employees){

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.save(employees);
		transaction.commit();

	}

	public void update(Employees employees) {

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.update(employees);
		transaction.commit();

	}

	public void delete(Employees employees){

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.delete(employees);
		transaction.commit();

	}

	public Employees load(Integer pk) {

		return	(Employees)session.load(Employees.class,pk);

	}

	public List getAll(){

		Criteria criteria = session.createCriteria(Employees.class);
		return criteria.list();

	}

	public List findByFirstNameLike(String firstName){

		Criteria criteria = session.createCriteria(Employees.class).add(Restrictions.like("firstName",firstName));
		return criteria.list();
		
	}

	public List byExample(Employees employees){

		Criteria cri = session.createCriteria(Employees.class);
		Example exam = Example.create(employees);
		cri.add(exam);
		return cri.list();
		 
	}

	public void closeSession(){
		session.close();
	}

}