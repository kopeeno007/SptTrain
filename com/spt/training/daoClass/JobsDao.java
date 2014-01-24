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

public class JobsDao {

	Session session = HibernateTrain.getSession();

	public JobsDao(){

	}

	public void create(Jobs jobs){

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.save(jobs);
		transaction.commit();

	}

	public void update(Jobs jobs) {

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.evict(jobs);
		session.update(jobs);
		transaction.commit();

	}

	public void delete(Jobs jobs){

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.evict(jobs);
		session.delete(jobs);
		transaction.commit();

	}

	public Jobs load(String pk) {

		return (Jobs)session.load(Jobs.class,pk);

	}

	public List getAll(){
		
		Criteria criteria = session.createCriteria(Jobs.class);
		return criteria.list();

	}

	public List findByJobTitleLike(String jobTitle){

		
		Criteria criteria = session.createCriteria(Jobs.class).add(Restrictions.like("jobTitle",jobTitle));
		return criteria.list();
		
	}

	public List byExample(Jobs jobs){

		
		Criteria cri = session.createCriteria(Jobs.class);
		Example exam = Example.create(jobs);
		cri.add(exam);
		return cri.list();
		 
	}

	public void closeSession(){
		session.close();
	}

}	
