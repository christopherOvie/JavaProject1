package arrayInterview;

public class SortingAnAray {

	public static void main(String[] args) {
		int []b = {9,3,7,8,1}; 
		int temp;
		//compare succesive numbers and swap them
		//compare 2 with other index  smallest bring it 
		//take first index compare with the other
		
		for(int i=0;i<5;i++) {
			
			for(int j =i+1;j<5;j++) {
				if(b[i]>b[j]) {
					//swap
					temp = b[i];
					b[i]=b[j];
					b[j]=temp;
					
				}
			}

	}
		//write forloop to retreive all array values
		for(int i =0;i<5;i++) {
			System.out.print(" , "+b[i]);
			
		}

	}
}
