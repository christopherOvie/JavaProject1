package sandipClass;

public class Calculator3 {

	
	public static int sum(int i, int j) {
		int sum = i + j;
		
		return sum;
		//System.out.println("sum is "+(i+j));
	}
	
	public static int multiply(int i, int j,int k) {
		int multiply = i*j*k;
		return multiply;

	}
	
	
	public static void main(String[] args) {
	int returnedSum =	sum(6,9);
	int returedMultiplicaton =	multiply(7,9,6);
	System.out.println(returnedSum);
	System.out.println(returedMultiplicaton);
;
	}

}
