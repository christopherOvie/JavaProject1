package w3esourceConstructors;

public class ClassroomClasswithArrayInitializationConstructor {
	
    private String className;
    private String[] students;
    
 // Parameterized constructor that initializes className and students
    public ClassroomClasswithArrayInitializationConstructor(String className, String[] students) {
        // Initialize instance variables with provided parameters
        this.className = className;
        this.students = students;
        
        
        
    }
    
    // Method to print the values of className and students
    public void printClassroom() {
        System.out.println("Class Name: " + className);
        System.out.print("Students: ");
        for (String student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
    }
    
    // Main method to test the Classroom class
    public static void main(String[] args) {
    	// Create an array of student names
        String[] studentArray = {"Andrine", "Ruslan", "Martin"};
     // Create a Classroom object using the parameterized constructor
        ClassroomClasswithArrayInitializationConstructor classroom = new ClassroomClasswithArrayInitializationConstructor("Science 101", studentArray);
        classroom.printClassroom();
	}
}

