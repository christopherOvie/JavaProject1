package arrayInterview;

import java.util.ArrayList;

public class CompareTwoDiffBetArrVsArrayList {
//compare same indexex of 2 different array and create another array of matching values
	
	public static void main(String[] args) {
		int []a = {2,4,6,8,18};
		int []b = {2,9,5,6,18};    // 2,18 matches
		ArrayList<Integer> a1= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==b[i]) {
				a1.add(a[i]);
			}
		}
//convert array list back to array
	Object[] c= a1.toArray();
	//extract every element in the array and place 
	for(Object ob : c){
		System.out.println(ob);
	}
	}

}
