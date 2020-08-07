package textio;

public class R {
	public static void main (String [] args) {
		String inputLine; // Line of text input by user.
		System.out.print("Enter a line of text: ");
		inputLine = TextIO.getln();
		System.out.println();
		printRowsFromString( inputLine );
	}
	private static void printRow( char ch, int N ) {
		int i; // Loop-control variable for counting off the copies.
		for ( i = 1; i <= N; i++ ) {
		System.out.print( ch );
		}
		System.out.println();
	}
	private static void printRowsFromString(String str) {
		int i;
		for (i = 0 ; i <= str.length() ; i++) {
			printRow( str.charAt(i), 25);
		}
	}
}
