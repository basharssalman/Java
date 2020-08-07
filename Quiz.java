
public class Quiz {

	public static void main(String[] args) {
		// Objects of MultipleChoiceQuestion
		MultipleChoiceQuestion question = new MultipleChoiceQuestion(
				"Which country won the world cup in 1998? \n", " Brazil\n",
				" Spain\n", " Italy\n", " France\n"," Argentina\n", "D");
		question.check(); // calling check function
				
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion( 
				"How many times did France win the world cup? \n", " 1\n", 
				" 2\n", " 3\n", " 4\n", " 5\n", "B");
		question2.check();
		
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion (
				"When was the last time France won the World Cup? \n", " 2002\n",
				" 2006\n", " 2010\n", " 2014\n", " 2018\n", "E");
		question3.check();
		
		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion (
				"how many times did france win UEFA European Championship? \n",
				"1", "2", "3", "4", "5", "B");
		question4.check();
		
		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion (
				"when did france win UEFA European Championship the last time?",
				"1984 \n", "1996 \n", "2000 \n", "2008 \n", "2016\n", "E");
		question5.check();
		
		MultipleChoiceQuestion.showResults(); // Replace the message dialog that shows the results with a call to the class method "showResults".
	}

}
