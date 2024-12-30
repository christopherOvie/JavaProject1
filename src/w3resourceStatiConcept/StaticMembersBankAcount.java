package w3resourceStatiConcept;


//Static Members in Different Contexts
//Write a Java program to create a class called "BankAccount" with instance variables 'accountNumber' and balance,
//and static variables 'bankName' and 'interestRate'. 
//Provide static methods to get and set the static variables. Create several 'BankAccount' objects and print their details along with the static variables.
public class StaticMembersBankAcount {

	// Instance variables
    private String accountNumber;
    private double balance;
    
    // Static variables
    private static String bankName;
    private static double interestRate;
    
 // Constructor to initialize instance variables
    public StaticMembersBankAcount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
 // Static method to get the bank name
    public static String getBankName() {
        return bankName;
    }

    // Static method to set the bank name
    public static void setBankName(String name) {
        bankName = name;
    }
    
    // Static method to get the interest rate
    public static double getInterestRate() {
        return interestRate;
    }

    // Static method to set the interest rate
    public static void setInterestRate(double rate) {
        interestRate = rate;
    }
    
    // Method to print the details of the BankAccount object
    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
	public static void main(String[] args) {
		 // Set static variables
		StaticMembersBankAcount.setBankName("National Bank");
		StaticMembersBankAcount.setInterestRate(3.5);
		
		

        // Create BankAccount objects
		StaticMembersBankAcount account1 = new StaticMembersBankAcount("123456789", 1000.00);
		StaticMembersBankAcount account2 = new StaticMembersBankAcount("987654321", 2000.00);
		
		// Print details of each BankAccount object
        account1.printDetails();
        System.out.println();
        account2.printDetails();

	}

}
