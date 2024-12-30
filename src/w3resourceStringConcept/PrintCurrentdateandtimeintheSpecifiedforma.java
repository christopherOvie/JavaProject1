package w3resourceStringConcept;

import java.util.Calendar;

public class PrintCurrentdateandtimeintheSpecifiedforma {

	public static void main(String[] args) {
		// Get an instance of the Calendar class representing the current date and time.
        Calendar c = Calendar.getInstance();
        
     // Print the message indicating current date and time.
        System.out.println("Current Date and Time :");
        
     // Print the formatted date (month day, year) using the specified format.
        System.out.format("%tB %te, %tY%n", c, c, c);
        
        
        // Print the formatted time (hour:minute am/pm) using the specified format.
        System.out.format("%tl:%tM %tp%n", c, c, c); 
	}

}
//Current Date and Time :
//December 20, 2024
//6:32 pm