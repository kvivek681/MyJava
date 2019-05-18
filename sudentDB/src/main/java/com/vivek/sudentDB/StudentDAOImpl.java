package com.vivek.sudentDB;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class StudentDAOImpl implements StudentDAOInterface {
	private static SessionFactory sessionFactory=null;
	static {
			Configuration cfg=new Configuration();
			cfg.setProperty("hibernate.hbm2ddl.auto", "update");
			cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
			cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/neon");
			cfg.setProperty("hibernate.connection.username", "root");
			cfg.setProperty("hibernate.connection.password", "vivek@123");
			cfg.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
			
			cfg.addAnnotatedClass(StudentPojo.class);
			
			ServiceRegistry sfg=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
			sessionFactory=cfg.buildSessionFactory(sfg);
		
		
		
	}

	public void addStudent(StudentPojo sp) {
		// TODO Auto-generated method stub
		Session ss=sessionFactory.openSession();
		ss.getTransaction().begin();
		ss.persist(sp);
		ss.getTransaction().commit();
		System.out.println("Student "+sp+" added to DataBase successfully!!");
		
		
	}

	public void showStudent(int id) {
		// TODO Auto-generated method stub
		Session ss=sessionFactory.openSession();
		ss.getTransaction().begin();
		StudentPojo sp=ss.get(StudentPojo.class, id);
		sp.setMarks(86);
		ss.persist(sp);
		ss.getTransaction().commit();
		System.out.println(sp);
		
	}

	public void showHQLStud() {
		// TODO Auto-generated method stub
		Session ss=sessionFactory.openSession();
		String str="select name,marks,address.pincode from StudentPojo where marks>:marks";
		Query qr=ss.createQuery(str);
		qr.setParameter("marks", 80);
		List<Object[]> list=qr.getResultList();
		for(Object[] sp:list) {
			System.out.println(sp[0]+" "+sp[1]+" "+sp[2]);
		}
		
	}

	public void showCriteriaStud() {
		// TODO Auto-generated method stub
		Session ss=sessionFactory.openSession();
		CriteriaBuilder cb=ss.getCriteriaBuilder();
		CriteriaQuery<Object> cq=cb.createQuery(Object.class);
		Root<StudentPojo> root=cq.from(StudentPojo.class);
		cq.multiselect(root.get("name"),root.get("address")).where(cb.or(cb.like(root.get("name"), "%k%"),cb.ge(root.get("marks"),80)));
		Query qr=ss.createQuery(cq);
		@SuppressWarnings("unchecked")
		List<Object[]> list=qr.getResultList();
		for(Object[] ob:list) {
			System.out.println(ob[0]+" "+((Address) ob[1]).getPincode());
		}
		
	}

}
