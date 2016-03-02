package com.hibernate.chapter2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Customer.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(false, true);
		SessionFactory sesFactory = config.buildSessionFactory();
		Session ses = sesFactory.getCurrentSession();
		
		ses.beginTransaction();
		
		CustomerDetails custdetails = new CustomerDetails();
		custdetails.setCustomerAddress("sdf");
		custdetails.setCustomerRating("0");
		custdetails.setCustomerRewards("good");
		
		Customer cust = new Customer();
		cust.setCustDetails(custdetails);
		cust.setCustomerName("Arun");
		
		ses.save(cust);
		
		ses.getTransaction().commit();
		
	}

}
