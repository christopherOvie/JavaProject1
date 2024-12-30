package w3resourceStringConcept;

public class CompareagivenStringtothespecifiedStringBuffer {

	public static void main(String[] args) {
		// Declare and initialize two string variables, str1 and str2.
        String str1 = "example.com", str2 = "Example.com";
        
     // Create a StringBuffer object strbuf initialized with the value of str1.
        StringBuffer strbuf = new StringBuffer(str1);
     // Compare str1 and strbuf for content equality and print the result.
        System.out.println("Comparing " + str1 + " and " + strbuf + ": " + str1.contentEquals(strbuf));
    
        // Compare str2 and strbuf for content equality and print the result.
        System.out.println("Comparing " + str2 + " and " + strbuf + ": " + str2.contentEquals(strbuf));

	}

}
//Comparing example.com and example.com: true
//Comparing Example.com and example.com: false