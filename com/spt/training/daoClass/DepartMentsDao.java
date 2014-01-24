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


public class DepartMentsDao {

	Session session = HibernateTrain.getSession();

	public DepartMentsDao() {

	}

	public void create(DepartMents departMents){

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.evict(departMents);
		session.save(departMents);
		transaction.commit();

	}

	public void update(DepartMents departMents) {

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.update(departMents);
		transaction.commit();

	}

	public void delete(DepartMents departMents){

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.evict(departMents);
		session.delete(departMents);
		transaction.commit();

	}

	public DepartMents load(Integer pk) {

		return (DepartMents)session.load(DepartMents.class,pk);

	}

	public List getAll(){

		Criteria criteria = session.createCriteria(DepartMents.class);
		return criteria.list();

	}

	public List findByDepartMentsNameLike(String departMentsName){

		Criteria criteria = session.createCriteria(DepartMents.class).add(Restrictions.like("departMentsName",departMentsName));
		return criteria.list();
		
	}

	public List regionsByExample(DepartMents departMents){

		Criteria cri = session.createCriteria(DepartMents.class);
		Example exam = Example.create(departMents);
		cri.add(exam);
		return cri.list();
		 
	}

	public void closeSession(){
		session.close();
	}

}