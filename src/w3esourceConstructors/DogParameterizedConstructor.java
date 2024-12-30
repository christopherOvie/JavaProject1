package w3esourceConstructors;

public class DogParameterizedConstructor {

	 // Private instance variables
    private String name;
    private String color;
    
    
    // Parameterized constructor
    public DogParameterizedConstructor(String name, String color) {
        // Initialize name with the provided parameter
        this.name = name;
        // Initialize color with the provided parameter
        this.color = color;
    }
	
	
	
	public static void main(String[] args) {
		// Create a new Dog object using the parameterized constructor
		
		DogParameterizedConstructor dog = new DogParameterizedConstructor("bulldog","brown");
System.out.println("name of dog "+dog.name + " "+ "colour of dog is " +dog.color);

	}

}
