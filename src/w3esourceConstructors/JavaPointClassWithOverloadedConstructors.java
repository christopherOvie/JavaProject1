package w3esourceConstructors;

public class JavaPointClassWithOverloadedConstructors {
	
	 // Private instance variables
    private int x;
    private int y;
    // Constructor that takes int parameters
    
    public JavaPointClassWithOverloadedConstructors(int x, int y) {
        // Initialize instance variables
        this.x = x;
        this.y = y;
    }
	
 // Constructor that takes double parameters
    public JavaPointClassWithOverloadedConstructors(double x, double y) {
        // Initialize instance variables by casting double to int
        this.x = (int) x;
        this.y = (int) y;
    }
	
 // Method to print the values of x and y
    public void printPoint() {
        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }
	
	
	
	
	public static void main(String[] args) {
		 // Create a Point object using the int constructor
		JavaPointClassWithOverloadedConstructors point1 = new JavaPointClassWithOverloadedConstructors(4, 5);
		
        // Print the values of point1
		point1.printPoint();
		
		 // Create a Point object using the double constructor
		JavaPointClassWithOverloadedConstructors point2 = new JavaPointClassWithOverloadedConstructors(4.5, 5.5);
        // Print the values of point2
        point2.printPoint();
		
		
	}

}
