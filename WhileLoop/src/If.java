import textio.TextIO;
public class If {
	public static void main(String [] args) {
		for (int attemptsCount = 0; attemptsCount > 0; attemptsCount--) {
			if (attemptsCount == 0)
				   System.out.print("You have exceeded your attempts");
			System.out.println("You can try one more time, do you want to try?");
			boolean c;
			c = TextIO.getlnBoolean();
			if (c == false) {
				System.out.print("Thanks!");
			    break;
			}
			attemptsCount--;

		}
	}
}


