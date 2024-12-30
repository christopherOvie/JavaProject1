package w3resourceStatiConcept;

public class StaticBlocksinJavaInitializerClassExample {

	 // Declare a static variable initialValue
    static int initialValue;
    
 // Static block to initialize initialValue
    static {
        initialValue = 1000;
        System.out.println("Static block: initialValue initialized to " + initialValue);
    }
    
    // Main method to demonstrate the static block
	public static void main(String[] args) {
		 System.out.println("Before creating an instance: initialValue = " + StaticBlocksinJavaInitializerClassExample.initialValue);
		 
		// Create an instance of Initializer
		 StaticBlocksinJavaInitializerClassExample initializer = new StaticBlocksinJavaInitializerClassExample();
		 
		 

	        // Print initialValue after creating an instance
	        System.out.println("After creating an instance: initialValue = " + StaticBlocksinJavaInitializerClassExample.initialValue);

	}

}
