package w3esourceArayList;

import java.util.ArrayList;

public class Replace2ndEementArrayListWithTheSpecifiedElement {

	public static void main(String[] args) {
		  ArrayList<String>  animal = new ArrayList<String>();
		  animal.add("lion");
		  animal.add("tiger");

		  System.out.println("Original array list: " + animal);
		  
		  String newAnimal = "Elephant";
		  
		  animal.set(1, newAnimal);
		  
		 int num= animal.size();
		 
		 System.out.println("Replace second element with 'Elephant'.");
		 
		 for(int i =0;i<animal.size();i++) {
			 System.out.println(animal.get(i));
		 }
	}

}
