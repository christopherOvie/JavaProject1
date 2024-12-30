package arrayInterview;

public class MultiplyTwoNumbers {
	
	
	public static  int sumArray(int [] a) { //making it static can diectly call
	
		int sum =0;
		//return sum;
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			sum = sum+ a[i];
		}
		return sum;
		
	}
	public static void main(String[] args) { 
		
		int []a= {2,4,6,8,10};
		
	int sum  =	sumArray(a);
	
		System.out.println(sum);
		
		
		
	}

}
