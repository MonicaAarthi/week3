package week3.day2;

public class College extends University {

   

	public static void main(String[] args) {
		
	College cl = new College();
	
    cl.pg();
    cl.ug();
	
	}

	
	@Override
	public void ug() {
		
		System.out.println("UG Completed");
		
	}


}


