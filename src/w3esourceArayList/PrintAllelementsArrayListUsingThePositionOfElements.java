package w3esourceArayList;

import java.util.ArrayList;

public class PrintAllelementsArrayListUsingThePositionOfElements {

	public static void main(String[] args) {
		ArrayList <String> c1 = new ArrayList <String> ();
		  c1.add("Red");
		  c1.add("Green");
		  c1.add("Black");
		  c1.add("White");
		  c1.add("Pink");
		  System.out.println("\nOriginal array list: " + c1);
		  
		 int noOfElements = c1.size();
		 
		 for(int index =0; index < noOfElements;index++) {
			 System.out.println(c1.get(index));
		 }

	}

}
