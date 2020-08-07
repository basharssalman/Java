package sdasdasd;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayTime {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of array");  // Asking user to enter the size of the array.
		Scanner sc = new Scanner(System.in);
		int array_size = sc.nextInt();      // Scans user input.
		
		int[] array_1 = new int[array_size];   // Both array has same size according to the data inserted. 
		int[] array_2 = new int[array_size];
		
		
		// Inserting the arrays with random integer but both with same integer. Both arrays are similar.  
		
		for (int i = 0; i < array_1.length; i ++) {
			
			int temp = (int) (100*Math.random());  // The maximum inger value is taken to be 100.
			
			array_1[i] = temp;
			array_2[i] = temp;
		} // End of for loop.
		
		long time_array_1 = 0;   // Time required for sorting the array.
		
		long time_array_2 = 0;	 // Time required for sorting the array. 
		
		long startTime = System.currentTimeMillis();
		insertionSort(array_1);
		time_array_1 = System.currentTimeMillis() - startTime;
		
		startTime = System.currentTimeMillis();
		Arrays.sort(array_2);
		time_array_2 = System.currentTimeMillis() - startTime;
		
		System.out.println("The first array took " + time_array_1 + " milisecond using insertionSort() method");
		System.out.println("The second array took " + time_array_2 + " milisecond using Arrays.sort() method");
		
		sc.close();
		// TODO Auto-generated method stub

	} // End of main
	
	static void insertionSort(int[] A) {
		// Sort the array A into increasing order;
		
		int itemsSorted;  // Number of items that have been sorted so far.
		
		for(itemsSorted = 1; itemsSorted < A.length; itemsSorted ++) {
			// Assume that items A[0], A[1], ...A[itemSorted-1] have already been sorted
			// Insert A[itemsSorted] into the sorted part of the list.
			
			int temp = A[itemsSorted];  // The item to be inserted.
			int loc = itemsSorted - 1; // Start at end of list. 
			
			while(loc >= 0 && A[loc] > temp ) {
				A[loc + 1] = A[loc] ;  // Bump items from A[loc] up to loc+1.
				loc = loc - 1;         // Go on to next location. 
			} // End of while
			
			A[loc + 1] = temp; // Put temp in last vacated space;
			
		} // End of for loop
		
	}// End of insertionSort

}
