package com.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class Dbconn {
	
	Session session;
	public Session gConnection() {
		
		
		Configuration con = new Configuration();
		
		con.configure();
		
		
		SessionFactory sf = con.buildSessionFactory();
		
		session = sf.openSession();
		
		return session;
	}

	
}
