package hackarank;

public class IntegerToStringConversion {

	public static void main(String[] args) {
		int n = 16;
		// Convert the integer to a string
		String x = Integer.toString(n);
		
		// Check if the conversion was successful
		
		if(n == Integer.parseInt(x)) {
			System.out.println("Good job");
		}else {
			System.out.println("bad job");
		}

	}

}
