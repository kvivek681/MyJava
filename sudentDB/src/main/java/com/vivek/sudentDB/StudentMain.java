package com.vivek.sudentDB;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StudentPojo sp=new StudentPojo();
		/*
		 * Address ad=new Address(); ad.setBuildingNo("Sec- 4/D, Q.No-2264");
		 * ad.setAddress1("Bokaro Steel City, Near Shiv Mandir");
		 * ad.setAddress2("Jharkhand"); ad.setPincode(827004);
		 * 
		 * sp.setAddress(ad); sp.setName("Kumar Vivek"); sp.setMarks(90);
		 * //sp.setRoll(1); StudentDAOInterface st=new StudentDAOImpl();
		 * st.addStudent(sp);
		 */
		StudentDAOInterface st=new StudentDAOImpl();
		//st.showStudent(1);
		
		//st.showHQLStud();
		st.showCriteriaStud();

	}

}
