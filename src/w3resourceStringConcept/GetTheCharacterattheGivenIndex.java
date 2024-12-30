package w3resourceStringConcept;

public class GetTheCharacterattheGivenIndex {

	public static void main(String[] args) {
		  // Declare and initialize a string variable "str" with the value "Java Exercises!".
        String str = "Java Exercises!";
        // Print the original string.
        System.out.println("Original String = " + str);
        
        
        // Get the character at positions 0 and 10.
        int index1 = str.charAt(0); // Get the ASCII value of the character at position 0.
        int index2 = str.charAt(10); // Get the ASCII value of the character at position 10.
        
        // Print out the results.
        System.out.println("The character at position 0 is " +
                (char)index1); // Print the character at position 0 by converting ASCII value to char.
        System.out.println("The character at position 10 is " +
                (char)index2); // Print the character at position 10 by converting ASCII value to char.
        
        System.out.println(index1);

	}

}
//Original String = Java Exercises!
//The character at position 0 is J
//The character at position 10 is i
//74