package jj;

public class CountDivisors {
public static void main(String[] args) {
	int rowNumber;
	int N;
	for ( rowNumber = 1; rowNumber <= 12; rowNumber++ ) {
		for ( N = 1; N <= 12; N++ ) {
		// print in 4-character columns
		System.out.printf( "%4d", N * rowNumber ); // No carriage return !
		}
		System.out.println(); // Add a carriage return at end of the line.
		}
}}

