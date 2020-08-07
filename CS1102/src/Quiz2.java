import javax.swing.JOptionPane;

public class Quiz2 {
	static String correctAnswer; // this global variable helps define the correct answer for each question
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	public static void main(String[] args) {
		
		String question1 = "Which country won the world cup in 1998? \n";
		question1 += "A. Brazil\n";
		question1 += "B. Spain\n";
		question1 += "C. Italy\n";
		question1 += "D. France\n";
		question1 += "E. Argentina\n";
		correctAnswer = "D"; // assigning the correct answer for each question
		check(question1, correctAnswer); // calling check function
		String question2 = "How many times did France win the world cup? \n";
		question2 += "A. 1\n";
		question2 += "B. 2\n";
		question2 += "C. 3\n";
		question2 += "D. 4\n";
		question2 += "E. 5\n";
		correctAnswer = "B";
		check(question2, correctAnswer);
		String question3 = "When was the last time France won the World Cup? \n";
		question3 += "A. 2002\n";
		question3 += "B. 2006\n";
		question3 += "C. 2010\n";
		question3 += "D. 2014\n";
		question3 += "E. 2018\n";
		correctAnswer = "E";
		check(question3, correctAnswer);
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
	}
	static String ask(String question) {
		String answer = JOptionPane.showInputDialog(question);
		while(true) {
			answer = answer.toUpperCase();
			if (answer.equals(correctAnswer)) { // for each case, if the answer is correct the returned value is "Correct"
				return "Correct!"; 
			}
			//if the answer is not correct, we should examine if it's valid
			else if (answer.equals("A") || answer.equals("B") || answer.equals("C") ||
					 answer.equals("D")|| answer.equals("E"))
				return "Incorrect. Please try again.";
			// if the answer is not one of the previous characters, then it's invalid answer
			else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.\"\r\n");
				answer = JOptionPane.showInputDialog(question);
			}
		}	
	}
	static void check(String question, String correctAnswer) {
		String answer = ask(question);
		nQuestions++; //increment "nQuestions" each time it is called.
		if (answer.equals("Correct!")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect++; // increment "nCorrect" for each correct answer.
		}
		// if the answer is incorrect, this message will be displayed with the correct answer
		else {JOptionPane.showMessageDialog(null, "Incorrect.The correct answer is " + correctAnswer);}
	
	}
}
