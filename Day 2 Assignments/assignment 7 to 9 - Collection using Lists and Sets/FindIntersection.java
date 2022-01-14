package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		
		int[] m={3,2,11,4,6,7};
		int[] n={1,2,8,4,9,7};
		
		
		//declare a list for 2nd array
		List<Integer> lt1 = new ArrayList<Integer>();
		
		//iterate and adding values to list
		for (int i = 0; i < m.length; i++) {	
		lt1.add(m[i]);
		}
		
		//System.out.println(lt1);
		
		//declare a list for 2nd array
		List<Integer> lt2 = new ArrayList<Integer>();
		
		//iterate and adding values to list
		for (int j = 0; j < n.length; j++) {
			
			lt2.add(n[j]);
		}
		
		//System.out.println(lt2);
		
		//sort list 1 and 2
	    Collections.sort(lt1);
	    Collections.sort(lt2);
	    
	    // retains the same value alone
	     lt1.retainAll(lt2);
	    	 
	     System.out.println("The result is:" +lt1);
	    

	}

}
