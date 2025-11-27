package com.dao;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;

import com.model.User;
import com.util.Dbconn;

public class Datadao {

	
	Dbconn db = new Dbconn();
	Session s = db.gConnection();
	
	org.hibernate.Transaction t = s.beginTransaction();
	//method for insert query
	public void insertData(User user) {
		s=db.gConnection();
		t=s.beginTransaction();
		s.save(user);
		t.commit();
		s.close();
		
	}
	
	public void UpdateData(User user) {
		s=db.gConnection();
		t=s.beginTransaction();
		s.update(user);
		t.commit();
		s.close();
	}
	
	public void DeleteData(User user) {
		s=db.gConnection();
		t=s.beginTransaction();
		s.delete(user);
		t.commit();
		s.close();
	}
	
	public User fetchData(int id ) {
		User user=null;
		s=db.gConnection();
		try {
			user = (User) s.get(User.class,id);
			
		}catch(ObjectNotFoundException e) {
			e.printStackTrace();
		}
		
		return user;
		
	}
	
	public List<User> FetchAllData(){
		s=db.gConnection();
		List<User> list = s.createQuery("from User").list();
		return list;
	}
}
