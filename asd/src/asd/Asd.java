package asd;

public class Asd {
	public interface FunctionR2R {
		double valueAt( double x );
		}
	
	static double sum( FunctionR2R f, int start, int end ) {
		double total = 0;
		for (int n = start; n <= end; n++) {
		total = total + f.valueAt( n );
		}
		return total;
		}
	
	public static void main(String [] args) {
		System.out.print("The sum of n squared for n from 1 to 100 is ");
		System.out.println( sum( x -> x*x, 1, 100 ) );
		System.out.print("The sum of 2 raised to the power n, for n from 1 to 10 is ");
		System.out.println( sum( num -> Math.pow(2,num), 1, 10 ) );
		
	}
}