package textio;

import textio.TextIO;

public class Light {
	static void lighting (double height, int colorTemrature) {// these are the formal parameters that
        // we declare in the method's definition
		double h = height;
		int t = colorTemrature;
		while (true) {
		if (t < 1000 || h < 0 || h > 2.5 || t > 10000)
			{System.out.println("Please enter a valid value");
			break;}
		if (t < 4000)
			System.out.println ("This color temprature is good for chiling");
		else System.out.println("This color temrature is good for reading");
		if (h < 1.5)
			System.out.println ("Yyou need to raise your light");
		else System.out.println ("Your light height is perfect");
		break;
		}
	}
	public static void main (String [] args) {
		System.out.println ("Please enter the height and color tempature  you prefer ");
		double h1 = TextIO.getlnDouble();// the user will assign the actual parameter "height"
		int t1 = TextIO.getlnInt(); // the user will assign the actual parameter "colorTemrature"
		lighting(h1, t1); // these are the actual parameters that we defined in the main method
                                  // and assign there values to the formal parameters when calling the method
	}
}
