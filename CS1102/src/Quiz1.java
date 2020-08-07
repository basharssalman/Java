import javax.swing.JOptionPane;

public class Quiz1 {
	
	public static void main(String[] args) {
		
		String question = "Which country won the world cup in 1998? \n";
		question += "A. Brazil\n";
		question += "B. Spain\n";
		question += "C. Italy\n";
		question += "D. France\n";
		question += "E. Argentina\n";	
		check(question, ask(question));

	}
	static String ask(String question) {
		String answer = JOptionPane.showInputDialog(question);
		
		while(true) {
			answer = answer.toUpperCase(); // moved this method inside the while loop to check the entries after entering the loop
			if (answer.equals("D")) {
				return "Correct!"; // if the answer is correct, break from the loop
			}
			else if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("E")) { 
				JOptionPane.showMessageDialog(null,"Incorrect. Please try again.");
				answer = JOptionPane.showInputDialog(question);
			}
			else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.\"\r\n");
				answer = JOptionPane.showInputDialog(question);
			}
		}	
	}
	static void check(String question, String correctAnswer) {
		correctAnswer = ask(question);
		if (correctAnswer.equals("D")) {
			JOptionPane.showMessageDialog(null,"Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect.The correct answer is .");
		}
	}
}
