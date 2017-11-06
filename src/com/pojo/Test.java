package com.pojo;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfiguration ac=
				new AnnotationConfiguration().configure("Sample.cfg.xml");
		SessionFactory sf=ac.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t= s.beginTransaction();
		t.begin();
		Employee e= new Employee();
		e.setEmpid(10);
		e.setEmpName("vaibhav");
		s.save(e);
		t.commit();
		s.close();
		System.out.println("inserted");
	}

}
