package textio;

import textio.TextIO;

public class N {
	static void noon (int number) {
		int n;
		n = number;
		for (int d = 1 ; d <= n ; d++ ) {
			if (n % d == 0) {
				System.out.println (d);
			}
		}
		
	}
	public static void main(String [] args) {
		int w;
		System.out.println("enter an integer");
		w = TextIO.getlnInt();
		noon(w);
	}
}
