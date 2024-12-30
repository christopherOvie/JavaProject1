package w3esourceArayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveAnElementInArray {

	public static void main(String[] args) {
		
	List<String>listofItems = new ArrayList<>();
	listofItems.add("mango");
	listofItems.add("banana");
	listofItems.add("orange");
	listofItems.add("pear");
	listofItems.add("guava");
	

System.out.println(listofItems);
listofItems.remove(3);
System.out.println(listofItems);



	}

}
