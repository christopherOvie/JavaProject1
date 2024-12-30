package w3esourceArayList;

import java.util.ArrayList;
import java.util.List;

public class searchForElementInArray {

	public static void main(String[] args) {
		
	List<String>listofItems = new ArrayList<>();
	listofItems.add("mango");
	listofItems.add("banana");
	listofItems.add("orange");
	listofItems.add("pear");
	listofItems.add("guava");
	

if(listofItems.contains("mango")) {
System.out.println("found the elemen");
}
else {
	System.out.println("did not find the element");
}

	}

}
