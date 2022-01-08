package org.student;

import org.department.Department;

  public class Student extends Department {

  public void studentName() {
		
		System.out.println("Name of the Student: Monica Aarthi M");
		
   }
	
   public void studentDept() {
		
		System.out.println("Concerned Department: BE(ECE)");
		
	}
	
   public void studentId() {
		
		System.out.println("Student ID: 02EC45");
		
	}
  
   public static void main(String[] args) {
  
       Student st = new Student();
    
       st.collegeName();
       st.collegeCode();
       st.collegeRank();
 
       st.deptName();
 
       st.studentName();
       st.studentDept();
       st.studentId();
   	  
  }
}
