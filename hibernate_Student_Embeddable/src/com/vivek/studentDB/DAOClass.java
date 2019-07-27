package com.vivek.studentDB;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

public class DAOClass implements DAOInterface {
	
	public int addStudent(Student student) {
		Session session=new HibernateUtility().getFactory().getCurrentSession();
		
		session.getTransaction().begin();
		int id=(int) session.save(student);
		session.getTransaction().commit();
		
		return id;
		
		
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Session session=new HibernateUtility().getFactory().getCurrentSession();
		session.getTransaction().begin();
		
		Student student=session.get(Student.class, id);
		if(student==null) {
			return null;
		}
		
		return student;
	}

	@Override
	public Student deleteStudent(int id) {
		// TODO Auto-generated method stub
		Session session=new HibernateUtility().getFactory().getCurrentSession();
		
		session.getTransaction().begin();
		Student student=session.get(Student.class, id);
		if(student!=null) {
			
			session.delete(student);
			session.getTransaction().commit();
			return student;
		}
		else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudentList() {
		Session session=new HibernateUtility().getFactory().getCurrentSession();
		
		String str="from student";
		session.getTransaction().begin();
		Query query=session.createQuery(str);
		List<Student> student=query.getResultList();
		if(student.size()==0) {
			return null;
		}
		return student;
	}

}
