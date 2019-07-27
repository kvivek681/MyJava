package com.vivek.studentDB;

import java.util.List;

public interface DAOInterface {
	public int addStudent(Student student);
	public Student getStudent(int id);
	public Student deleteStudent(int id);
	public List<Student> getStudentList();

}
