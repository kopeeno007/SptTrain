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

public class ProjectDao {

	public ProjectDao() {

	}

	public void create(Project project){

		Session session = HibernateTrain.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.save(project);
		transaction.commit();

	}

	public void update(Project project) {

		Session session = HibernateTrain.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.update(project);
		transaction.commit();

	}

	public void delete(Project project){

		Session session = HibernateTrain.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.delete(project);
		transaction.commit();

	}

	public Object load(Integer pk) {

		return	HibernateTrain.getSession().load(Project.class,pk);

	}

	public List getAll(){
		Session session = HibernateTrain.getSession();
		Criteria criteria = session.createCriteria(Project.class);
		return criteria.list();

	}

	public List findByProjectNameLike(String projectName){

		Session session = HibernateTrain.getSession();
		Criteria criteria = session.createCriteria(Project.class).add(Restrictions.like("projectName",projectName));
		return criteria.list();
		
	}

	public List byExample(Project project){

		Session session = HibernateTrain.getSession();
		Criteria cri = session.createCriteria(Project.class);
		Example exam = Example.create(project);
		cri.add(exam);
		return cri.list();
		 
	}
}