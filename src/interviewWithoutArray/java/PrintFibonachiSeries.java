package interviewWithoutArray.java;

public class PrintFibonachiSeries {

	public static void main(String[] args) {
	int a=0;
	int b =1;
	int sum =0;
	int i=1;
	while(i < 9) {
		sum = a+b;
		System.out.println(sum);
		a=b;
		b=sum;
		i++;
	}

	}

}
