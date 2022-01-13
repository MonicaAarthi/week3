package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String s = "PayPal India";
		
		String s1 = s.replace(" ", "");
			
        //Convert it into a character array
	    char[] arr = s1.toCharArray();
	    
        //Declare a Set as charSet for Character
	    Set <Character> charSet = new LinkedHashSet<Character>(); 
	    
	   //Declare a Set as dupCharSet for duplicate Character
	    Set <Character> dupCharSet = new LinkedHashSet<Character>(); 
	   
	   //Iterate character array and add it into charSet
	      
        for (char c : arr) {
			
        	boolean add = charSet.add(c);
        	
	  //if the character is already in the charSet then, add it to the dupCharSet  	
        
        	if (!add) {
        		
        		dupCharSet.add(c);
        		
        	}
        	
		}
	    
        System.out.println(dupCharSet);
        
        //Check the dupCharSet elements and remove those in the charSet
        
        charSet.removeAll(dupCharSet);
        
        
       //print each character for charSet
        System.out.println(charSet);
             
	}
        
	    }
	    	
	    	
	    	
	    
	    
		
		
		
		
		
		
		

	


