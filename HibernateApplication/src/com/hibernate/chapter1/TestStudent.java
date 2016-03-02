package com.hibernate.chapter1;

import java.sql.Date;
import java.util.GregorianCalendar;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Student.class);
		config.configure("hibernate.cfg.xml");
		
		//new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		 Student stu = new Student();
		 //stu.setStudent_id(100);
		 stu.setStudent_name("Sourabh");
		 stu.setStudent_Email("a@a.com");
		 stu.setStudent_password("souPass");
		 stu.setPermanent(true);
		 stu.setStudent_joinDate(new GregorianCalendar(2016, 02, 14));
		 stu.setStudent_loginTime(Date.valueOf("2016-02-14"));
		 session.save(stu);
		 
		 Student stu0 = new Student();
		 //stu0.setStudent_id(100);
		 stu0.setStudent_name("Sourabh0");
		 stu0.setStudent_Email("a@a.com");
		 stu0.setStudent_password("souPass");
		 stu0.setPermanent(true);
		 stu0.setStudent_joinDate(new GregorianCalendar(2016, 02, 14));
		 stu0.setStudent_loginTime(Date.valueOf("2016-02-14"));
		 session.save(stu0);

		 Student stu1 = new Student();
		 //stu1.setStudent_id(100);
		 stu1.setStudent_name("Sourabh1");
		 stu1.setStudent_Email("a@a.com");
		 stu1.setStudent_password("souPass");
		 stu1.setPermanent(true);
		 stu1.setStudent_joinDate(new GregorianCalendar(2016, 02, 14));
		 stu1.setStudent_loginTime(Date.valueOf("2016-02-14"));
		 session.save(stu1);
		 
		 Student stu2 = new Student();
		 //stu2.setStudent_id(100);
		 stu2.setStudent_name("Sourabh2");
		 stu2.setStudent_Email("a@a.com");
		 stu2.setStudent_password("souPass");
		 stu2.setPermanent(true);
		 stu2.setStudent_joinDate(new GregorianCalendar(2016, 02, 14));
		 stu2.setStudent_loginTime(Date.valueOf("2016-02-14"));
		 session.save(stu2);
		 
		 Student stu3 = new Student();
		 //stu3.setStudent_id(100);
		 stu3.setStudent_name("Sourabh3");
		 stu3.setStudent_Email("a@a.com");
		 stu3.setStudent_password("souPass");
		 stu3.setPermanent(true);
		 stu3.setStudent_joinDate(new GregorianCalendar(2016, 02, 14));
		 stu3.setStudent_loginTime(Date.valueOf("2016-02-14"));
		 session.save(stu3);
		 
		 session.getTransaction().commit();
}
}