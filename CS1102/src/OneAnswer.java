import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OneAnswer extends CheckBoxQuestion implements ItemListener {
	
	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}

	public OneAnswer(String q, String a, String b, String c, String d, String answer) {
		super(q);
		this.a = new JRadioButton(a);
		this.a = new JRadioButton(b);
		this.a = new JRadioButton(c);
		this.a = new JRadioButton(d);
		add(this.a);
		add(this.b);
		add(this.c);
		add(this.d);
	
		correctAnswer = answer;
	}

	public void itemStateChanged(ItemEvent item) {

		// implementation of each case of the JRadioButtons
		
	}
}
