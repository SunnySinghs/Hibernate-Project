package com.hibernate.inheritence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfiguration config = new  AnnotationConfiguration();
		config.addAnnotatedClass(Project.class);
		config.addAnnotatedClass(Module.class);
		config.addAnnotatedClass(Tasks.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory sesFac = config.buildSessionFactory();
		Session ses = sesFac.getCurrentSession();
		
		ses.beginTransaction();
		
		Project p = new Project();
		p.setProjectName("projectName");
		ses.save(p);
		
		Module m = new Module();
		m.setProjectName("ModuleProjectName");
		m.setModuleName("moduelName");
		ses.save(m);
		
		Tasks t = new Tasks();
		t.setProjectName("taskProjectName");
		t.setModuleName("taskModuleName");
		t.setTaskName("TaskName");
		ses.save(t);
		
		ses.getTransaction().commit();
	}

}
