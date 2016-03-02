package com.hibernate.manytomanymapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Event.class);
		config.addAnnotatedClass(Delegates.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory sesFac = config.buildSessionFactory();
		Session ses = sesFac.getCurrentSession();
		
		ses.beginTransaction();
		Delegates d1 = new Delegates();
		d1.setDelegateName("A");
		
		Delegates d2 = new Delegates();
		d2.setDelegateName("B");
		
		Delegates d3 = new Delegates();
		d3.setDelegateName("C");
		
		Delegates d4 = new Delegates();
		d4.setDelegateName("D");
		
		Event e1 = new Event();
		e1.setEventName("AA");
		
		Event e2 = new Event();
		e2.setEventName("BB");
		
		Event e3 = new Event();
		e3.setEventName("CC");
		
		 e1.getLd().add(d1);
		 e1.getLd().add(d2);
		 e1.getLd().add(d3);
		 
		 e2.getLd().add(d2);
		 e2.getLd().add(d3);
		 
		 e3.getLd().add(d4);
		 
		 ses.save(d1);
		 ses.save(d2);
		 ses.save(d3);
		 ses.save(d4);
		 ses.save(e1);
		 ses.save(e2);
		 ses.save(e3);
		 
		 ses.getTransaction().commit();
	}
	

}
