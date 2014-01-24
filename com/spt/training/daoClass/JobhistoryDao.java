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

public class JobhistoryDao {

	public JobhistoryDao() {

	}

	public void create(Jobhistory jobhistory){

		Session session = HibernateTrain.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.save(jobhistory);
		transaction.commit();

	}

	public void update(Jobhistory jobhistory) {

		Session session = HibernateTrain.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.update(jobhistory);
		transaction.commit();

	}

	public void delete(Jobhistory jobhistory){

		Session session = HibernateTrain.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.delete(jobhistory);
		transaction.commit();

	}

	public Object load(Integer pk) {

		return	HibernateTrain.getSession().load(Jobhistory.class,pk);

	}

	public List getAll(){
		Session session = HibernateTrain.getSession();
		Criteria criteria = session.createCriteria(Jobhistory.class);
		return criteria.list();

	}

	public List findByJobIdLike(String jobId){

		Session session = HibernateTrain.getSession();
		Criteria criteria = session.createCriteria(Jobhistory.class).add(Restrictions.like("jobId",jobId));
		return criteria.list();
		
	}

	public List byExample(Jobhistory jobhistory){

		Session session = HibernateTrain.getSession();
		Criteria cri = session.createCriteria(Jobhistory.class);
		Example exam = Example.create(jobhistory);
		cri.add(exam);
		return cri.list();
		 
	}

}