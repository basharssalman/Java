package textio;

public class Sub {

static void print3NSequence(int startingValue) {
int N; // One of the terms in the sequence.
int count; // The number of terms.
N = startingValue; // The first term is whatever value
// is passed to the subroutine as
// a parameter.
count = 1; // We have one term, the starting value, so far.
System.out.println("The 3N+1 sequence starting from " + N);
System.out.println();
System.out.println(N); // print initial term of sequence
while (N > 1) {
if (N % 2 == 1) // is N odd?
N = 3 * N + 1;
else
N = N / 2;
count++; // count this term
System.out.println(N); // print this term
}
System.out.println();
System.out.println("There were " + count + " terms in the sequence.");
} // end print3NSequence

public static void main(String[] args) {
System.out.println("This program will print out 3N+1 sequences");
System.out.println("for starting values that you specify.");
System.out.println();
int K; // Input from user; loop ends when K < 0.
do {
System.out.println("Enter a starting value.");
System.out.print("To end the program, enter 0: ");
K = TextIO.getInt(); // Get starting value from user.
if (K > 0) // Print sequence, but only if K is > 0.
print3NSequence(K);
} while (K > 0); // Continue only if K > 0.
} // end main
}