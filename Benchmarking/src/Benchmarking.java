import java.util.Arrays;

/**
 * Benchmarking class: demonstrating two different searching algorithms for two
 * identical arrays, the first algorithm is the insertion sort that is copied
 * from the text-book, the second algorithm is used with the function sort(int
 * []) from the class Arrays. the size of the two arrays is set by three
 * constants, for simplisty, we can set the array size when initializing the
 * first array, and then let the second
 *
 * array be equal to the first one The time recorded for the the two sorting
 * algorithms with size 1000 is: Using insertionSort method: 5 ~ 16 ms Using
 * sort method from class Arrays: 1 ms
 *
 * The time recorded for the the two sorting algorithms with size 10000 is:
 * Using insertionSort method: 52 ~ 75 ms Using sort method from class Arrays: 6
 * ms
 *
 * The time recorded for the the two sorting algorithms with size 10000 is:
 * Using insertionSort method: 4529 ~ 4302 ms Using sort method from class
 * Arrays: 11 ~ 19 ms
 *
 * @author Student
 **/
public class Benchmarking {

	/**
	 * This method is copied from the text-book it's used to sort an incremental
	 * array of integers precondition: in our case, the array will be initialized
	 * with random integers postcondition: the array will be sorted in increasing
	 * order
	 * 
	 * @param A the array that we want to sort
	 **/
	static void insertionSort(int[] A) {
		// Sort the array A into increasing order.
		int itemsSorted; // Number of items that have been sorted so far.
		for (itemsSorted = 1; itemsSorted < A.length; itemsSorted++) {
			// Assume that items A[0], A[1], ... A[itemsSorted-1]
			// have already been sorted. Insert A[itemsSorted]
			// into the sorted part of the list.
			int temp = A[itemsSorted]; // The item to be inserted.
			int loc = itemsSorted - 1; // Start at end of list.
			while (loc >= 0 && A[loc] > temp) {
				A[loc + 1] = A[loc]; // Bump item from A[loc] up to loc+1.
				loc = loc - 1; // Go on to next location.
			}
			A[loc + 1] = temp; // Put temp in last vacated space.
		}
	} // (Eck, 2019, pp.361-362)

	public static void main(String[] args) {
		/**
		 * here we have three constants, we can change the size of array using these
		 * constants
		 * 
		 */

		final int firstSize = 1000;
		final int secondSize = 10000;
		final int thirdSize = 100000;
		// the array size can be changed between the three constants
		int[] firstArray = new int[thirdSize];
		int[] secondArray;

		int i = 0;
		while (i < firstArray.length) {

			firstArray[i] = (int) Integer.MAX_VALUE * (int) (1000 * Math.random());
			i++;
		}

		secondArray = firstArray;

		// Timing the first array sorting, using insertionSort method
		long startTime = System.currentTimeMillis();
		insertionSort(firstArray);
		long runTime = System.currentTimeMillis() - startTime;
		/**
		 *
		 * The following line will print the sorted array, it has been commented because
		 * printing the array may take a lot of memory and crash the program
		 * 
		 **/
		// System.out.println(Arrays.toString(firstArray));
		System.out.print("Sort using insertionSort method: ");
		System.out.println(runTime + " ms");

		// Timing the second array sorting, using sort method
		startTime = System.currentTimeMillis();
		Arrays.sort(secondArray);
		runTime = System.currentTimeMillis() - startTime;
		/**
		 *
		 * The following line will print the sorted array, it has been commented because
		 * printing the array may take a lot of memory and crash the program
		 *
		 **/
		// System.out.println(Arrays.toString(secondArray));
		System.out.print("Sort using sort method: ");
		System.out.println(runTime + " ms");
	}
}
