import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

abstract public class CheckBoxQuestion extends JFrame {
	QuestionDialog question;
	String correctAnswer;
	static String answercount;
	public JLabel label;
	public JRadioButton a;
	public JRadioButton b;
	public JRadioButton c;
	public JRadioButton d;
	public ButtonGroup group;
	
	void addButton(JPanel buttons, String label) {}

	public CheckBoxQuestion(String q) {

		super("title");
		this.question = new QuestionDialog();
		this.question.setLayout(new FlowLayout());
		this.question.add(new JLabel("     " + question + "      ", JLabel.CENTER));
		a = new JRadioButton("a", false);
		b = new JRadioButton("b", false);
		c = new JRadioButton("c", false);
		d = new JRadioButton("d", false);
		add(a);
		add(b);
		add(c);
		add(d);
		group = new ButtonGroup();
		group.add(a);
		group.add(b);
		group.add(c);
		group.add(d);
		
		
	}
}
