import java.awt.Button;
import javax.swing.JFrame;

public class Quiz {

	public static void main(String[] args) {
		Question question = new MultipleChoiceQuestion("Which country won the world cup in 1998? \n", " Brazil\n",
				" Spain\n", " Italy\n", " France\n", " Argentina\n", "D");
		question.check();

		Question question2 = new MultipleChoiceQuestion("How many times did France win the world cup? \n", " 1\n",
				" 2\n", " 3\n", " 4\n", " 5\n", "B");
		question2.check();

		Question question3 = new MultipleChoiceQuestion("When was the last time France won the World Cup? \n",
				" 2002\n", " 2006\n", " 2010\n", " 2014\n", " 2018\n", "E");
		question3.check();

		Question question4 = new MultipleChoiceQuestion("how many times did france win UEFA European Championship? \n",
				"1", "2", "3", "4", "5", "B");
		question4.check();

		Question question5 = new MultipleChoiceQuestion("when did france win UEFA European Championship the last time?",
				"1984 \n", "1996 \n", "2000 \n", "2008 \n", "2016\n", "E");
		question5.check();

		Question question6 = new TrueFalseQuestion("The half-life of carbon-14 is 5,730 years ", "TRUE");
		question6.check();

		Question question7 = new TrueFalseQuestion("Half-Life episode 3 released in 2008 ", "FALSE");
		question7.check();

		Question question8 = new TrueFalseQuestion(
				"The equation for half-life of an element is: half-life = ln (2) / (decay constant)", "TRUE");
		question8.check();

		Question question9 = new TrueFalseQuestion(
				"Half-life is the time required for a quantity to reduce to its initial value ", "FALSE");
		question9.check();

		Question question10 = new TrueFalseQuestion("Half-Life is published by Valve ", "TRUE");
		question10.check();

		MultipleChoiceQuestion.showResults();


	}

}
