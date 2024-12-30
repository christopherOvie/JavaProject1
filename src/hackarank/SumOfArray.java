package hackarank;

public class SumOfArray {

	public static void main(String[] args) {
		
		int []numbers= {1,22,5,7,89,67,98,43};
		
		
		//initialize sumvriable
		
		int sum =0;
		
		//usng orloop iterate throgh he array add each element to the sum
		for(int number: numbers) {
			sum = sum + number;
		}
System.out.println(sum);
	}

}
