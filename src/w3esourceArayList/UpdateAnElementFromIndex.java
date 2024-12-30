package w3esourceArayList;

import java.util.ArrayList;
import java.util.List;

public class UpdateAnElementFromIndex {

	public static void main(String[] args) {
		
	List<String>listofItems = new ArrayList<>();
	listofItems.add("mango");
	listofItems.add("banana");
	listofItems.add("orange");
	listofItems.add("pear");
	listofItems.add("guava");
listofItems.set(2, "peach");//mango
System.out.println(listofItems);




	}

}
