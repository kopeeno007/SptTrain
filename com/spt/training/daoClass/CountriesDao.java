package com.spt.training.daoClass;
import org.apache.log4j.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.spt.training.domain.*;
import com.spt.training.daoClass.*;
import java.util.List;
import com.spt.training.*;
import org.hibernate.Transaction;
import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.criterion.*;

public class CountriesDao {

	Session session = HibernateTrain.getSession();

	public CountriesDao(){

	}

	public void create(Countries countries){

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.save(countries);
		transaction.commit();

	}

	public void update(Countries countries) {

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.update(countries);
		transaction.commit();

	}

	public void delete(Countries countries){

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.evict(countries);
		session.delete(countries);
		transaction.commit();

	}

	public Countries load(String pk) {

		return (Countries)session.load(Countries.class,pk);

	}	

	public List getAll(){

		Criteria criteria = session.createCriteria(Countries.class);
		return criteria.list();

	}

	public List findByCountryNameLike(String countryName){


		Criteria criteria = session.createCriteria(Countries.class).add(Restrictions.like("countryName",countryName));
		return criteria.list();
		
	}

	public List regionsByExample(Countries countries){

		Criteria cri = session.createCriteria(Countries.class);
		Example exam = Example.create(countries);
		cri.add(exam);
		return cri.list();
		 
	}

	public void closeSession(){
		session.close();
	}



}