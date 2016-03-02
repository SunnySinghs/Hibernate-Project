package com.hibernate.chapter2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(School.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory sesFac = config.buildSessionFactory();
		Session ses = sesFac.getCurrentSession();
		
		ses.beginTransaction();
		
		School sch = new School();
		sch.setSchoolName("HPS");
		sch.setSchooladdress("abc");
		sch.setPublic(false);
		sch.setRating(0);
		
		ses.save(sch);
		
		ses.getTransaction().commit();
	}

}
