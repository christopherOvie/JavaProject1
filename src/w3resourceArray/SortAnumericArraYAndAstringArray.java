package w3resourceArray;

import java.util.Arrays;

public class SortAnumericArraYAndAstringArray {

	public static void main(String[] args) {
		 // Declare and initialize an integer array.
        int[] my_array1 = {1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
        
        // Declare and initialize a string array.
        String[] my_array2 = {"Java","Python","PHP", "C#", "C Programming","C++"};  
        
     // Print the original numeric array.
        System.out.println("Original numeric array : " + Arrays.toString(my_array1));
        
        
     // Sort the numeric array in ascending order.
        Arrays.sort(my_array1);
        
        // Print the sorted numeric array.
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));
        
        // Print the original string array.
        System.out.println("Original string array : " + Arrays.toString(my_array2));
        
        // Sort the string array in lexicographical (alphabetical) order.
        Arrays.sort(my_array2);
        

        // Print the sorted string array.
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));
	}

}
//Original numeric array : [1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456]
//Sorted numeric array : [1254, 1456, 1456, 1457, 1458, 1472, 1789, 1899, 2013, 2035, 2165, 2365, 2456, 2458]

//Original string array : [Java, Python, PHP, C#, C Programming, C++]
//Sorted string array : [C Programming, C#, C++, Java, PHP, Python]