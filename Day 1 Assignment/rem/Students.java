package org.rem;

public class Students {

	public void getStudentInfo(int id) {
		
		System.out.println("Student Id is:"+id);
			
	}
	
    public void getStudentInfo(int id, String name) {
		
		System.out.println("Student Id and Name is:"  +id+" "+name);
			
	}
	
	
    public void getStudentInfo(String email,long phoneNumber) {
		
		System.out.println("Email Id and Phone number: "+email+ " " +phoneNumber);
			
	}
	
	
	public static void main(String[] args) {
		
	Students st = new Students();
	
	st.getStudentInfo(24);
	
	st.getStudentInfo(24,"Monica Aarthi M");
	
    st.getStudentInfo("abcd@gmail.com",12345678L);
    		
	}

}
