package com.hibernate.onetomanymapping;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.hibernate.onetoonemapping.Person;
import com.hibernate.onetoonemapping.PersonDetails;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(College.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory sesFac = config.buildSessionFactory();
		Session ses = sesFac.getCurrentSession();
		
		ses.beginTransaction();
		
		College cg = new College();
		cg.setCollegeName("LPU");
		
		Student st = new Student();
		st.setStudentName("sourabh");
		st.setCollege(cg);
		
		Student st1 = new Student();
		st1.setStudentName("Akash");
		st1.setCollege(cg);
		
		ses.save(cg);
		ses.save(st);
		ses.save(st1);
		
		ses.getTransaction().commit();
	}

}
