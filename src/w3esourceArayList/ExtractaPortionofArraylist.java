package w3esourceArayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExtractaPortionofArraylist {

	public static void main(String[] args) {
		// CreaTe a list and add some colors to the list
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println("Original list: \n" + list_Strings);
		  
		  List<String> sub_List =  list_Strings.subList(0, 3);
		  
		  System.out.println("final list: \n" + sub_List);
		  
	}

}
