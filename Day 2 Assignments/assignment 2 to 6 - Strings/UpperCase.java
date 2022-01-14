package week3.day2;

public class UpperCase {

	public static void main(String[] args) {
		

		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
		
		String test = "changeme";
		
		char[] ch = test.toCharArray();
	
		// Traverse through each character (using loop)
		for(int i=0; i<ch.length;i++) {
			
			//find the odd index within the loop (use mod operator)
			if(i%2!=0) {
				
				//change the old index to uppercase
				ch[i] = Character.toUpperCase(ch[i]);
				
			}	
			
		}
		
		System.out.println(ch);
		
	}
	
	
}
