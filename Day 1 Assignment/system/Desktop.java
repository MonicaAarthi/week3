package org.system;

public class Desktop extends Computer{ 

     public void desktopSize() {
    	 
    	 System.out.println("Size is 15 inches");
	
 }
	public static void main(String[] args) {
		
	Desktop dt = new Desktop();
	
	dt.computerModel();
	
	dt.desktopSize();
		
	}

}
