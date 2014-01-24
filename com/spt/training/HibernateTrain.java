package com.spt.training;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTrain {
	private static final Logger logger = Logger.getLogger(HibernateTrain.class);
	private static final SessionFactory sessionFactory;

	public HibernateTrain() {

	}

	static {
		try {
			Configuration cfg = new Configuration();
			sessionFactory = cfg.configure().buildSessionFactory();
		} catch (Throwable ex) {
			logger.error(ex.getMessage());
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static Session getSession() throws HibernateException {
		return sessionFactory.openSession();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}

	public static void main(String[] args) {
		logger.debug("Session :"+HibernateTrain.getSession());

	}

}