package SillySentence;
/**
 * main class: contains the main method
 * @author Student
 *
 */

public class Main extends SillySentence{
	
	public static void main(String [] args) {

		while (true) {
	         sentence();
		     System.out.println(".\n\n");
	         try {
	             Thread.sleep(3000); // every 3000 mili second a new sentence
	         }
	         catch (InterruptedException e) {
	         }
	      }
	}
}
