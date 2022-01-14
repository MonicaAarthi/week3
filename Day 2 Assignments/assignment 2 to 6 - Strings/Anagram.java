package week3.day2;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		
		String text1="stops";
		String text2="potss";
		
		int len1 = text1.length();
		int len2 = text2.length();
		
		if(len1==len2) {
			
			char[] arr1 = text1.toCharArray();
			char[] arr2 = text2.toCharArray();
			
			//List<Character> lt = new ArrayList<Character>();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2)) {
				System.out.println("It's an anagram");
				
			} else {
				
				System.out.println("It's not an anagram");				
			}
			
		}
		
		else {
			System.out.println("String length is not same");
		}

	}
}

