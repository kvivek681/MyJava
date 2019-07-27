package com.vivek.studentDB;

import java.util.List;
import java.util.Scanner;

public class MainClass {
	
	private static DAOClass daoClass=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c='Y';
		while(c=='Y' || c=='y') {
			System.out.println("=================================================================================");
			System.out.println("1. Add Student");
			System.out.println("2. Show Student Details");
			System.out.println("3. Delete Student Record");
			System.out.println("4. Show stored record");
			System.out.println("5. Exit");
			System.out.println("=================================================================================");
			
			
			System.out.println("Select the numeric option :");
			int value=Integer.valueOf(sc.nextLine());
			
			
			switch(value) {
			
			case 1:	Student student =new Student();
					
					System.out.println("Enter Student Name :");
					student.setName(sc.nextLine());
					
					System.out.println("Enter Student Marks :");
					student.setMarks(Integer.valueOf(sc.nextLine()));
								
					Address address=new Address();
					System.out.println("Enter House name :");
					address.setHouse(sc.nextLine());
					
					System.out.println("Enter City :");
					address.setCity(sc.nextLine());
					
					System.out.println("Enter State :");
					address.setState(sc.nextLine());
					
					System.out.println("Enter Zip code :");
					address.setZip(Integer.valueOf(sc.nextLine()));
					
			
					
					student.setAddress(address);
					daoClass=new DAOClass();
					System.out.println("The saved Student id is :"+daoClass.addStudent(student));
					break;
					
			case 2:	System.out.println("Enter the Student Id :");
					int id=Integer.valueOf(sc.nextLine());
					daoClass=new DAOClass();
					Student fetchStudent=daoClass.getStudent(id);
					if(fetchStudent==null) {
						System.out.println("The Student is not present in the record");
					}
					else {
						System.out.println(fetchStudent);
					}
					
				break;
				
			case 3:	daoClass=new DAOClass();
					System.out.println("Enter the id you want to remove :");
					int deleteId=sc.nextInt();
					sc.nextLine();
					
					Student delStudent=daoClass.deleteStudent(deleteId);
					if(delStudent==null) {
						System.out.println("Student Not found!!");
					}
					else {
						System.out.println("The deleted student is :"+delStudent);
					}
					break;
					
			case 4:	daoClass=new DAOClass();
					List<Student> fetchStudentList= daoClass.getStudentList();
					if(fetchStudentList==null) {
						System.out.println("Currently no record is there in the DB!!");
					}
					else {	
						fetchStudentList.forEach(System.out::println);
					}
					break;
					
			case 5: System.out.println("Exitting");
				System.exit(1);
			default:
				System.out.println("You have entered a wrong choice. Please choose the correct");
				continue;
			}
			System.out.println("Do you want to continue ?(n/y) :");
			c=sc.nextLine().charAt(0);
			
			
		}
		sc.close();

	}
	

}
