package w3resourceStatiConcept;

public class StaticMethodsAndVariablesIDGenerator {

	
//	Static Method with Static Variable
//	Write a Java program to create a class called "StaticMethodsAndVariablesIDGenerator" with a static variable 'nextID' and a static method "generateID()" that returns the next ID 
//	and increments 'nextID'. Demonstrate the usage of generateID in the main method
//	// Declare a static variable nextID
    private static int nextID = 1;
    
    // Define a static method generateID to return the next ID and increment nextID
    public static int generateID() {
        return nextID++;
    }
    
    // Main method to demonstrate the usage of StaticMethodsAndVariablesIDGenerator
	public static void main(String[] args) {
		// Generate and print IDs
        System.out.println("Generated ID: " + StaticMethodsAndVariablesIDGenerator.generateID());
        System.out.println("Generated ID: " + StaticMethodsAndVariablesIDGenerator.generateID());
        System.out.println("Generated ID: " + StaticMethodsAndVariablesIDGenerator.generateID());

	}

}
//Generated ID: 1
//Generated ID: 2
//Generated ID: 3
