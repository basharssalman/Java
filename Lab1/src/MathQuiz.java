import java.util.ArrayList;

/**
 * Simple quiz program that ask random questions the questions contain addition,
 * subtraction, multiplication, and division the questions should be randomly
 * generated
 * 
 * @author Bashar
 *
 */
public class MathQuiz {
	int[] question = new int[10];

	MathQuiz() {
		ArrayList<MathQuiz> q;
		MathQuiz add = add();
		add() = new ArrayList<MathQuiz>();
	}

	public void add() {
		for (int i = 0; i < question.length; i++) {
			int a = (int) (10 * Math.random());
			int b = (int) (10 * Math.random());
			int c = a + b;
		}
	}

	public void sub() {
		for (int i = 0; i < question.length; i++) {
			int a = (int) (10 * Math.random());
			int b = (int) (10 * Math.random());
			int c = a - b;
		}
	}
	public void multi() {
		for (int i = 0; i < question.length; i++) {
			int a = (int) (10 * Math.random());
			int b = (int) (10 * Math.random());
			int c = a * b;
		}
	}
	public void div() {
		for (int i = 0; i < question.length; i++) {
			int b = (int) (10 * Math.random());
			int c = (int) (10 * Math.random());
			int a = b * c;
		}
	}
}
