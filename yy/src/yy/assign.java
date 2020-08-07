package yy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import javax.swing.JFileChooser;

public class assign {
	static Scanner in;
	static HashSet<String> set = new HashSet<String>();
	public static void main(String args[]) throws FileNotFoundException {
		Scanner filein = new Scanner(new File("D:/words.txt"));
		
		while (filein.hasNext()) {

			String tk = filein.next();
			set.add(tk);
		}

		in = new Scanner(getInputFileNameFromUser());
		in.useDelimiter("[^a-zA-Z]+");
		while (in.hasNext()) {
			String word = in.next();
			System.out.println(set.contains(word));
		}

	}

	/**
	 * Lets the user select an input file using a standard file selection dialog
	 * box. If the user cancels the dialog without selecting a file, the return
	 * value is null.
	 */
	static File getInputFileNameFromUser() {
		JFileChooser fileDialog = new JFileChooser();
		fileDialog.setDialogTitle("Select File for Input");
		int option = fileDialog.showOpenDialog(null);
		if (option != JFileChooser.APPROVE_OPTION)
			return null;
		else
			return fileDialog.getSelectedFile();
	}

	static TreeSet corrections(String badWord, HashSet dictionary) {
		TreeSet<String> set2 = new TreeSet<String>();
		if (set.contains(badWord)) {
			set2.add(badWord);
		}
		return set2;
	}

}
