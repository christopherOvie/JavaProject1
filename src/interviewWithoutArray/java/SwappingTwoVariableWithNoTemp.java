package interviewWithoutArray.java;

public class SwappingTwoVariableWithNoTemp {

	public static void main(String[] args) {
		int a=5;
		int b=4;
		
		a=a+b; //9=5+4
		b=a-b; //5=9-4=b
		a=a-b;  //  9-4
		System.out.println(a);
		System.out.println(b);
				

	}

}
