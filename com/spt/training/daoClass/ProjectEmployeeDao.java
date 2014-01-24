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

public class ProjectEmployeeDao {

	public ProjectEmployeeDao() {

	}

	public void create(ProjectEmployee projectEmployee){

		Session session = HibernateTrain.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.save(projectEmployee);
		transaction.commit();

	}

	public void update(ProjectEmployee projectEmployee) {

		Session session = HibernateTrain.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.update(projectEmployee);
		transaction.commit();

	}

	public void delete(ProjectEmployee projectEmployee){

		Session session = HibernateTrain.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.delete(projectEmployee);
		transaction.commit();

	}

	public Object load(Integer pk) {

		return	HibernateTrain.getSession().load(ProjectEmployee.class,pk);

	}

	public List getAll(){
		Session session = HibernateTrain.getSession();
		Criteria criteria = session.createCriteria(ProjectEmployee.class);
		return criteria.list();

	}

	public List findByEmployeeId(String employeeId){

		Session session = HibernateTrain.getSession();
		Criteria criteria = session.createCriteria(ProjectEmployee.class).add(Restrictions.like("employeeId",employeeId));
		return criteria.list();
		
	}

	public List byExample(ProjectEmployee projectEmployee){

		Session session = HibernateTrain.getSession();
		Criteria cri = session.createCriteria(ProjectEmployee.class);
		Example exam = Example.create(projectEmployee);
		cri.add(exam);
		return cri.list();
		 
	}
}