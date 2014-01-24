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
import org.hibernate.Criteria;
import org.hibernate.criterion.*;


public class RegionsDao {

	Session session = HibernateTrain.getSession();

	public RegionsDao(){

	}

	public void create(Regions regions){

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.save(regions);
		transaction.commit();

	}

	public void update(Regions regions) {

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.update(regions);
		transaction.commit();

	}

	public void delete(Regions regions){

		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.evict(regions);
		session.delete(regions);
		transaction.commit();

	}

	public Regions load(Integer pk) {

		return (Regions)session.load(Regions.class,pk);

	}	

	public List getAll(){

		Criteria criteria = session.createCriteria(Regions.class);
		List results = criteria.list();
		return results;

	}

	public List findByNameLike(String regionName){

		Criteria criteria = session.createCriteria(Regions.class).add(Restrictions.like("regionName",regionName));
		List results = criteria.list();
		return results;

	}

	public List regionsByExample(Regions regions){

		Criteria cri = session.createCriteria(Regions.class);
		Example exam = Example.create(regions);
		cri.add(exam);
		List results = cri.list();
		return results;
	}

	public void closeSession(){
		session.close();
	}


}