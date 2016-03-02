package com.hibernate.onetoonemapping;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestPerson {

	public static void main(String[] args) {
		
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Person.class);
		config.addAnnotatedClass(PersonDetails.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory sesFac = config.buildSessionFactory();
		Session ses = sesFac.getCurrentSession();
		
		ses.beginTransaction();
		
		PersonDetails pd = new PersonDetails();
		pd.setZipcode("123z");
		pd.setJob("CS");
		pd.setIncome(123456);
		
		Person p = new Person();
		p.setPersonDetail(pd);
		p.setPersonName("Sourabh");
		
		ses.save(p);
		
		ses.getTransaction().commit();
		
	}
}
