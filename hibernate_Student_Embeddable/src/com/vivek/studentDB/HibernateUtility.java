package com.vivek.studentDB;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	private  SessionFactory factory=null;
	
	public SessionFactory getFactory() {
		if(factory==null) {
			Configuration cfg=new Configuration();
			Properties property=new Properties();
			
			property.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
			property.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
			property.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/neon");
			property.setProperty("hibernate.connection.user", "root");
			property.setProperty("hibernate.connection.password", "vivek@123");
			property.setProperty("hibernate.show_sql", "true");
			property.setProperty("hibernate.format_sql", "true");
			property.setProperty("hibernate.hbm2ddl.auto", "update");
			property.setProperty("hibernate.current_session_context_class", "thread");
			
			cfg.setProperties(property);
			cfg.addAnnotatedClass(Student.class);
			
			factory = cfg.buildSessionFactory();
			
		}
		
		return factory;
	}
}
