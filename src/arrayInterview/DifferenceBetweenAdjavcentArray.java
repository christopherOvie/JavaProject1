package arrayInterview;

public class DifferenceBetweenAdjavcentArray {

	public static void main(String[] args) {
		int []a = {2,4,6,8,18};
		
		int diff = 0;
		for(int i =0;i<a.length-1;i++) {
			
			if(a[i+1]-a[i]>diff){
				diff= a[i+1]-a[i];	
			}
			
		}
		System.out.println(diff);
	}

}
