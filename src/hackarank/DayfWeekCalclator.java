package hackarank;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayfWeekCalclator {

	public static void main(String[] args) {
		int day = 20;
		int month =  2;
		int year = 1970;
		
		//getDay(day,month,year);
		
		// Call the getDay method
        String dayOfWeek = getDay(day, month, year);
        
        // Print the result
        System.out.println("The day of the week is: " + dayOfWeek);

	}

	private static String getDay(int day, int month, int year) {
		// Create a LocalDate object with the given date
		
		LocalDate date=	LocalDate.of(year, month, day);
		// Get the day of the week for the given date
		
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		return dayOfWeek.toString();
	}

	
	
	
}
