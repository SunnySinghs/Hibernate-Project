package com.hibernate.compoundkey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestAccounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Accounts.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory sesFac = config.buildSessionFactory();
		Session ses = sesFac.getCurrentSession();
		
		ses.beginTransaction();
		CompoundKey compKey = new CompoundKey(100, 1001);
		Accounts acc1 = new Accounts();
		acc1.setAccountBalance(4000);
		acc1.setCompkey(compKey);
		
		CompoundKey compKey1 = new CompoundKey(100, 1002);
		Accounts acc2 = new Accounts();
		acc2.setAccountBalance(4000);
		acc2.setCompkey(compKey1);
		
		ses.save(acc1);
		ses.save(acc2);
		
		ses.getTransaction().commit();
		
	}

}
