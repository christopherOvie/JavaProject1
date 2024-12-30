package w3esourceMath;

public class EnumConcept {
	
	 public enum Weekend {
		    SATURDAY,
		    SUNDAY
		  }
	public enum DaysOfWeek {
	    SUNDAY,
	    MONDAY,
	    TUESDAY,
	    WEDNESDAY,
	    THURSDAY,
	    FRIDAY,
	    SATURDAY
	  }
	public static void main(String[] args) {
		DaysOfWeek today=	DaysOfWeek.MONDAY;
		System.out.println(today);
		
		 Weekend day1 = Weekend.SATURDAY;
		    Weekend day2 = Weekend.SUNDAY;

		    System.out.println("First day of the weekend: " + day1);
		    System.out.println("Second day of the weekend: " + day2);
		  
	}

}
