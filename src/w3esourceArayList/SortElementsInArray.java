package w3esourceArayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortElementsInArray {

	public static void main(String[] args) {
		
		List<String>listofItems = new ArrayList<>();
		listofItems.add("mango");
		listofItems.add("banana");
		listofItems.add("orange");
		listofItems.add("pear");
		listofItems.add("guava");
		
		System.out.println("before sorting is "+listofItems);
		
		Collections.sort(listofItems);
		
		System.out.println("After sorting is "+listofItems);
	}

}
