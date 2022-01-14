package week3.day2;

//import java.util.ArrayList;


public class ReverseEvenWords {

	public static void main(String[] args) {
		
		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an char array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		*/
		
		String test = "I am a software tester"; 
		
		String[] split = test.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
			if(i%2==0) {
				
				System.out.print(split[i] + " ");	
			}
			
			else {
				
		     char[] rev = split[i].toCharArray();
		     
		     for(int j=((rev.length)-1); j>=0; j--) {
		    	 
		    	System.out.print(rev[j]);	 
		     }
				
			System.out.print(" ");
		     
			}
			
		}
			
    }

	}
				   	   
		         

	
				
				
			
			
			
			
			
			
	
		
			
		
	      	
	      	
	    
	    
	    		
	    		
	    
	    
	    
	    
	    	  
	  
	    	  
		
	      	
	      	
	      	
	      	
	      
	    	 
	    	  
	    	  
		
	      	
		
	

