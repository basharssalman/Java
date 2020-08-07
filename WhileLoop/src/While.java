import textio.TextIO;
public class While {
	public static void main(String [] args) {
	int attemptsCount = 0;
	while (attemptsCount > 0) {
		System.out.println("You can try one more time, do you want to try?");
		boolean c;
		c = TextIO.getlnBoolean();
		if (c == false) {
			System.out.print("Thanks!");
		    break;
		}
		attemptsCount--;
	}
	if (attemptsCount == 0)
		   System.out.print("You have exceeded your attempts");

	}
}
