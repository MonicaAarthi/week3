package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
		// Here is the input
				//int[] arr = {1,2,3,4,7,6,8};

				// Sort the array	
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
			
				
				int[] arr = {1,2,3,4,7,6,8};
				
	List<Integer> lt1 = new ArrayList<Integer>();
	
	for (int i = 0; i < arr.length; i++) {
	
		lt1.add(arr[i]);	
	}		
		
	List<Integer> lt2 = new ArrayList<Integer>(lt1);
	
	for (int j = 1; j < 9; j++) {
		
		lt2.add(j);
	
	}
	
	//removes all lt1 values in lt2
	lt2.removeAll(lt1);
	
	System.out.println("Missing Element is:" + lt2);

	}

}
