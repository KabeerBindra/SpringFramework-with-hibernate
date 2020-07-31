package com.object;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
 
public class DaoImplement implements KabeerDao{
	@Autowired
	private  SessionFactory session;
	@org.springframework.transaction.annotation.Transactional
	
	public  List<Kabeers> getKabeers(){
	Session s = session.getCurrentSession();
	List<Kabeers> list = s.createQuery("from Kabeers", com.object.Kabeers.class).list();
		
		
		return list;
		
	}
}