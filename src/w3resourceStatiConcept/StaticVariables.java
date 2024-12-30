package w3resourceStatiConcept;

public class StaticVariables {

	
	// Static variable to keep track of the count of instances
    private static int count = 0;
    
    // Constructor increments the static variable count
    public StaticVariables() {
        count++;
    }
    // Static method to get the value of count
    public static int getCount() {
        return count;
    }
 // Main method to test the StaticVariables class
	public static void main(String[] args) {
		// Create several Counter objects
		StaticVariables c1 = new StaticVariables();
		StaticVariables c2 = new StaticVariables();
		StaticVariables c3 = new StaticVariables();
		
		
		System.out.println("Count: " + StaticVariables.getCount());  //Count: 3

	}

}
