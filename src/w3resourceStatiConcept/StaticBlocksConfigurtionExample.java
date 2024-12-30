package w3resourceStatiConcept;

public class StaticBlocksConfigurtionExample {

	
	// Declare a static variable configValue
    public static String configValue;
    
 // Static block to initialize configValue
    static {
        // Simulating reading from a configuration file by assigning a default value
        configValue = "Default Config Value";
        System.out.println("Static block executed: configValue initialized");
    }
    
	public static void main(String[] args) {
		 // Print the value of configValue
        System.out.println("Config Value: " + configValue);

	}

}
//Static block executed: configValue initialized
//Config Value: Default Config Value