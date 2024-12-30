package w3esourceArayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyOneArrayToAnotherArray2 {

	public static void main(String[] args) {
		List<String> List1 = new ArrayList<String>();
		  List1.add("1");
		  List1.add("2");
		  List1.add("3");
		  List1.add("4");
		  System.out.println("List1: " + List1);
		  List<String> List2 = new ArrayList<String>();
		  List2.add("A");
		  List2.add("B");
		  List2.add("C");
		  List2.add("D");
		  System.out.println("List2 before copy: " + List2);
		  List2.addAll(List1);
		  
		  System.out.println("List2 after copy: " + List2);
		  
		  
		  
	}

}
