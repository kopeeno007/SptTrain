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

public class StaffRoleDao {

	public StaffRoleDao(){

	}

	public void create(StaffRole staffRole){

		Session session = HibernateTrain.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.save(staffRole);
		transaction.commit();

	}

	public void update(StaffRole staffRole) {

		Session session = HibernateTrain.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.update(staffRole);
		transaction.commit();

	}

	public void delete(StaffRole staffRole){

		Session session = HibernateTrain.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.delete(staffRole);
		transaction.commit();

	}

	public Object load(Integer pk) {

		return	HibernateTrain.getSession().load(StaffRole.class,pk);

	}	

	public List getAll(){
		Session session = HibernateTrain.getSession();
		Criteria criteria = session.createCriteria(StaffRole.class);
		return criteria.list();

	}

	public List findByRoleNameLike(String roleName){

		Session session = HibernateTrain.getSession();
		Criteria criteria = session.createCriteria(StaffRole.class).add(Restrictions.like("roleName",roleName));
		return criteria.list();
		
	}

	public List byExample(StaffRole staffRole){

		Session session = HibernateTrain.getSession();
		Criteria cri = session.createCriteria(StaffRole.class);
		Example exam = Example.create(staffRole);
		cri.add(exam);
		return cri.list();
		 
	}

}