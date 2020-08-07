import textio.TextIO;
public class DoWhile {
	public static void main(String [] args) {
	int attemptsCount;
	attemptsCount = 1;
	do  {
		System.out.println("You can try one more time, do you want to try?");
		boolean c;
		c = TextIO.getlnBoolean();
		if (c == false) {
			System.out.print("Thanks!");
		    break;
		}
		attemptsCount--;

	}
	while (attemptsCount > 0);
	if (attemptsCount == 0)
		   System.out.print("You have exceeded your attempts");
	}
}
