package interviewWithoutArray.java;

public class PrintingPyramidPattern {

	public static void main(String[] args) {
		for(int i =1;i<5;i++) {
			//logic of printing right format
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				System.out.print("\t");
			}
			
			System.out.println();
			
		}

	}

}
