package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConnectionUtil {
	private static Session ses;

	private static SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	// get a Session from the SessionFactory Method
	public static Session getSession() {
		if (ses == null) {
			ses = sf.openSession();
		}
		return ses;
	}

}
