import javax.swing.JOptionPane;

public class ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String question = "What is an Algorithm?\n";
		
		question += "A. a process or set of rule to be followed in calculations or other problem-solving operations, especially by a computer\n";
		question += "B. a test of knowledge, especially a brief, informal test given to students\n";
		question += "C. a programatic problem list\n";
		question += "D. a solution list\n";
		question += "E. a step by step diagramatic flow to solve problems\n";
		
		String answer = JOptionPane.showInputDialog(question);
		
		
		
		//Using If condition statement
		/*
		 * if (answer.equals("A")) { JOptionPane.showMessageDialog(null,"Correct!");
		 * return; } else if (answer.equals("B")) {
		 * JOptionPane.showMessageDialog(null,"Incorrect. Please try again."); return; }
		 * else if (answer.equals("C")) {
		 * JOptionPane.showMessageDialog(null,"Incorrect. Please try again."); return; }
		 * else if (answer.equals("D")) {
		 * JOptionPane.showMessageDialog(null,"Incorrect. Please try again."); return; }
		 * else if (answer.equals("E")) {
		 * JOptionPane.showMessageDialog(null,"Incorrect. Please try again."); return; }
		 * else { JOptionPane.showMessageDialog(
		 * null,"Invalid answer. Please enter A, B, C, D, or E."); return; }
		 */
		//Using Switch Condition Statement
		while(true) {
		answer = answer.toUpperCase();
		switch(answer){
		case "A":
			JOptionPane.showMessageDialog(null,"Correct!");
			break;
		case "B":			
		case "C":			
		case "D":			
		case "E":
			JOptionPane.showMessageDialog(null,"Incorrect. Please try again.");
			answer = JOptionPane.showInputDialog(question);
			continue;
	    default:
			 JOptionPane.showMessageDialog( null,"Invalid answer. Please enter A, B, C, D, or E.");
				answer = JOptionPane.showInputDialog(question);
				continue;
				
		}
		break;
	}	 

	}

}


