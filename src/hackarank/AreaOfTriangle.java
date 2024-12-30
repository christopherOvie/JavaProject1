package hackarank;

public class AreaOfTriangle {

	public static void main(String[] args) {
		 // Directly assign values to B and H
        int B = 16;  // Example value for breadth
        int H = 8;  // Example value for height
        
        
        if (B <= 0 || H <= 0) {
        	System.out.println("java.lang.Exception: Breadth and height must be positive");
	}
        else {
        	
        	 // Calculate the area of the triangle
        	double  area = 0.5 * (B *  H);
        	System.out.println(area);
        }
}
}