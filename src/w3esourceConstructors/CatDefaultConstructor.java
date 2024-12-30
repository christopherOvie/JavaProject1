package w3esourceConstructors;

public class CatDefaultConstructor {

	 // Private instance variables
    private String name;
    private int age;
    
    // Default constructor
    private CatDefaultConstructor() {
    	// Initialize name to "Unknown"
    	this.name= "unknown";
    	this.age = 0;
    }
	
	
    
    public String getName() {
    	return name;
    }
    
    public int getAge() {
    	return age;
    }
	public static void main(String[] args) {
		  // Create a new Cat object using the default constructo
		CatDefaultConstructor cat = new CatDefaultConstructor();
		
		// Use the getter methods to access private variables
		
		System.out.println("name of cat is "+cat.getName());
		System.out.println("ag of cat is "+cat.getAge());
		

	}

}
