package sss;
import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class MouseWhisperer extends JFrame implements MouseListener {
    MouseWhisperer() {
        super("COME CLOSER");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent es) { setTitle("OUCH"); }//generated after a mouse released event if the user pressed and released
    //the mouse button on the same component;
    public void mousePressed(MouseEvent e) { setTitle("LET GO"); }//generated when the user presses one of the buttons
    //on the mouse
    public void mouseReleased(MouseEvent e) { setTitle("WHEW"); }//generated when the user releases one of the buttons on the
    //mouse
    public void mouseEntered(MouseEvent e) { setTitle("I SEE YOU"); } //generated when the mouse cursor moves from
   // outside a component into the component;
    public void mouseExited(MouseEvent e) { setTitle("COME CLOSER"); }//generated when the mouse cursor
    //moves out of a component
    public static void main(String[] args) { MouseWhisperer mouseWhisperer = new MouseWhisperer(); }
}