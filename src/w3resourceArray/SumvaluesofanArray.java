package w3resourceArray;

public class SumvaluesofanArray {

	public static void main(String[] args) {
        // Declare and initialize an integer array.
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Declare and initialize a variable to store the sum.
        int sum = 0;
for(int i :my_array) {
	
	sum = sum+ i;
	
	// Print the sum of the array elements.
   // System.out.println("The sum is " + sum);
}
System.out.println("The sum is " + sum);
	}

}
