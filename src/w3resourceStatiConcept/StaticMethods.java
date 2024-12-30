package w3resourceStatiConcept;

public class StaticMethods {

	 // Static method add that takes two integers and returns their sum
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Main method to demonstrate the usage of the static method
	public static void main(String[] args) {
		// Call the static method add without creating an instance of MathUtility
		
		int sum =	StaticMethods.add(5,30);
		//System.out.println("The sum of "+a" and  "+"b"+   " + sum);
		System.out.println("The sum of 5 and 30 is: " + sum);

	}

}
