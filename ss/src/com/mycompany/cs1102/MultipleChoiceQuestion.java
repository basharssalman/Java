/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cs1102;

/**
 *
 * @author ezekiel
 */
import javax.swing.JOptionPane;

/**
 *
 * @author ezekiel
 */
public class MultipleChoiceQuestion {
    static int nquestion = 0;
    static int ncorrect =0;
    String question;
    String CorrectAnswers;
    public MultipleChoiceQuestion (
            String query,String a,
            String b, String c, String d,
            String e, String answer ) {
        question = query + "\n";
        question += "A." + a +"\n";
        question += "B." + b +"\n";
        question += "C." + c +"\n";
        question += "D." + d +"\n";
        question += "E." + e +"\n";
        CorrectAnswers = answer;
        CorrectAnswers = answer.toUpperCase();
    }
        String Ask(){
        String Ans;
        while (true) {
        Ans = JOptionPane.showInputDialog(question);
        Ans = Ans.toUpperCase();
        if (Ans.equals("A")|| Ans.equals("B") || Ans.equals("C") ||
                Ans.equals("D") || Ans.equals("E")) 
            return Ans; 
        else 
              JOptionPane.showMessageDialog(null,"Invalid Answer, please enter A,B,C,D or E");
        }  
    }
        public void Check() {
        String Answer;
        while (true) {
        Answer = Ask();
        if (Answer.equals(CorrectAnswers)) {
            JOptionPane.showMessageDialog(null, Answer +" is the correct answer");
            ncorrect++;
        break;
        }
        else
            JOptionPane.showMessageDialog(null, "the correct answer is " + CorrectAnswers);
        nquestion++;
        }
    }
        public static void showresult () {
            JOptionPane.showMessageDialog(null,"you got" +ncorrect + "out of " + nquestion);
        }
}
