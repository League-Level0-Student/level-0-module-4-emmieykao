package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog(null, "What was your score on the last test?");
	double testscore = Double.parseDouble(x);

	 if(testscore>90) {
		JOptionPane.showMessageDialog(null, "Good job!");
	}
	else if (testscore>80) {
		JOptionPane.showMessageDialog(null, "Meh. Better luck next time.");
	}
	else if (testscore>70) {
		JOptionPane.showMessageDialog(null, "Did you try using flash cards?");
	}
	else {
		JOptionPane.showMessageDialog(null, "I have no words.");
	}
}
}
