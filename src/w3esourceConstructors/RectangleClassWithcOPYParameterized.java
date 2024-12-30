package w3esourceConstructors;

import java.awt.Rectangle;

public class RectangleClassWithcOPYParameterized {
	
//	Copy Constructor
//	Write a Java program to create a class called Rectangle with instance variables length and width. Implement a parameterized constructor 
//	and a copy constructor that initializes a new object using the values of an existing object. Print the values of the variables.
	 // Private instance variables
    private double length;
    private double width;

    // Parameterized constructor
    public RectangleClassWithcOPYParameterized(double length, double width) {
        // Initialize length with the provided parameter
        this.length = length;
        // Initialize width with the provided parameter
        this.width = width;
    }
    // Copy constructor
    // Copy constructor
    public RectangleClassWithcOPYParameterized(RectangleClassWithcOPYParameterized rect1) {
        // Initialize length with the length of the provided rectangle object
        this.length = rect1.length;
        // Initialize width with the width of the provided rectangle object
        this.width = rect1.width;
    }
    
    
	public static void main(String[] args) {
		// Create a new Rectangle object using the parameterized constructor
		RectangleClassWithcOPYParameterized rect1 = new RectangleClassWithcOPYParameterized(12.5, 4.5);
        // Print the values of the instance variables for rect1
        System.out.println("Rectangle 1 Length: " + rect1.length);
        System.out.println("Rectangle 1 Width: " + rect1.width);
        
        
        // Create a new Rectangle object using the copy constructor
        RectangleClassWithcOPYParameterized rect2 = new RectangleClassWithcOPYParameterized(rect1);
        // Print the values of the instance variables for rect2
        System.out.println("Rectangle 2 Length: " + rect2.length);
        System.out.println("Rectangle 2 Width: " + rect2.width);

	}

}
