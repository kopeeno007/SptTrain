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

public class LocationsDao {

	Session session = HibernateTrain.getSession();

	public LocationsDao() {

	}

	public void create(Locations location) {

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.save(location);
		transaction.commit();

	}

	public void update(Locations location) {

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		//session.evict(location);
		session.update(location);
		transaction.commit();
	}

	public void delete(Locations location) {

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.evict(location);
		session.delete(location);
		transaction.commit();
	}

	public Locations load(Integer pk) {

		return (Locations)session.load(Locations.class,pk);
		
	}

	public List getAll(){

		Criteria criteria = session.createCriteria(Locations.class);
		return criteria.list();

	}

	public List findByPostalCodeLike(String postalCode){

		Criteria criteria = session.createCriteria(Locations.class).add(Restrictions.like("postalCode",postalCode));
		return criteria.list();
		
	}

	public List byExample(Locations location){

		Criteria cri = session.createCriteria(Locations.class);
		Example exam = Example.create(location);
		cri.add(exam);
		return cri.list();
		 
	}

	public void closeSession(){
		session.close();
	}

}