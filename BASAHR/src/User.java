public class User { // an example of class
	
	// static variable, part of the representation of the class in memory.
	public static int numAcc = 0; 
	// non-static variables (instance variables)
	public String firstName, lastName, address;
	public int accountNumber;
	public double accountBalance; 
	 // function, returns the user's info
	public String userInfo(String firstName, String lastName, String address) {
		return (lastName.toUpperCase() + firstName + "," + address);
	}
	public static void main(String [] args) {
		User user1;
		user1 = new User(); // a new object from User class
		user1.firstName = "John";
		user1.lastName = "Smith ";
		user1.address = " NY";
		user1.accountNumber = 123;
		user1.accountBalance = 2000;
		numAcc++;
		User user2;
		user2 = new User() { // a second new object from User class
		firstName = "Mary";
		lastName = "Jones ";
		address = " NJ";
		accountNumber = 124;
		accountBalance = 3500.7;
		numAcc++;}
		System.out.println(user1.userInfo(user1.firstName, user1.lastName, user1.address));
		System.out.println("The number of accounts is: " + numAcc);
	}
}