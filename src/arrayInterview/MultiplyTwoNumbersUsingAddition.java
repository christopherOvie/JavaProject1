package arrayInterview;

public class MultiplyTwoNumbersUsingAddition {

	
public static int	multiply(int i, int j){
	
	int k =1;
	int sum =0;
	while(k<=j) {
		//5=0+5
		//10=5+5
		sum = sum+i; //i has to sum itsef j times to get result
		k++;
	}
	
	return sum;
		
	}
	public static void main(String[] args) {
		
	int result=	multiply(5,10);
	System.out.println(result);

	}

}
