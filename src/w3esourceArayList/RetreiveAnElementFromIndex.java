package w3esourceArayList;

import java.util.ArrayList;
import java.util.List;

public class RetreiveAnElementFromIndex {

	public static void main(String[] args) {
		
	List<String>listofItems = new ArrayList<>();
	listofItems.add("mango");
	listofItems.add("bana");
	listofItems.add("orange");
	listofItems.add("pear");
	listofItems.add("guava");
System.out.println(listofItems.get(0));//mago
System.out.println(listofItems.get(3));  //pear

	}

}
