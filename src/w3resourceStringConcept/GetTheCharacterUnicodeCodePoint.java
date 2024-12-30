package w3resourceStringConcept;

public class GetTheCharacterUnicodeCodePoint {

	public static void main(String[] args) {
		// Declare and initialize a string variable "str" with the value "w3resource.com".
        String str = "w3resource.com";
        // Print the original string.
        System.out.println("Original String : " + str);
        
        // Retrieve the Unicode code point at index 1 in the string.
        int val1 = str.codePointAt(1);
    
        // Retrieve the Unicode code point at index 9 in the string.
        int val2 = str.codePointAt(9);
        
        
        // Print the Unicode code point representing the character at index 1 in the string.
        System.out.println("Character(unicode point) = " + val1);
        // Print the Unicode code point representing the character at index 9 in the string.
        System.out.println("Character(unicode point) = " + val2);

	}

}
//Original String : w3resource.com
//Character(unicode point) = 51
//Character(unicode point) = 101