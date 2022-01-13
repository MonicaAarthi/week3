package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		int l = input.length;
		
		System.out.println("Length is:" +(l));
		
		List<String> lt = new ArrayList<String>();
		
		lt.add("HCL");
		lt.add("Wipro");
		lt.add("Aspire Systems");
		lt.add("CTS");
		
		Collections.sort(lt);
		
		System.out.println("sorted list:" +lt);
		
		Collections.reverse(lt);
		
		System.out.println("reversed list:" +lt);
		

	}

}
