package section3;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
	
		quickSort(intArray, 0, intArray.length);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	public static void quickSort(int[] input, int start, int end) {
		if (end - start < 2) {
			return;
		}
		
		System.out.println("Start: "+start);
		System.out.println("End: "+end);
		
		int pivotIndex = partition(input, start, end);
		System.out.println("Pivot index: "+pivotIndex);
		System.out.println("");
		
		// Sort  Left Array
		quickSort(input, start, pivotIndex);
		//Sort Right Array
		quickSort(input, pivotIndex + 1, end);
	}
	
	
	public static int partition(int[] input, int start, int end) {
		// use first element of the array as pivot
		int pivot = input[start];
		int i = start;
		int j = end;
		System.out.println("Pivot: "+pivot);
		
		while (i < j) {
			
			/** First Block: Move element less than pivot to before it **/
			// Empty loop body
			while (i < j && input[--j] >= pivot);
			System.out.println("First Block I: "+i);
			System.out.println("First Block J: "+j);
			if (i < j ) {
				input[i] = input[j];
				System.out.println(Arrays.toString(input));
				System.out.println("");
			}
			/** First Block End **/
			
			/** Second Block: Move element greater than pivot to after it **/
			// Empty loop body
			while (i < j && input[++i] <= pivot);
			System.out.println("Second  Block I: "+i);
			System.out.println("Second  Block J: "+j);
			if (i < j) {
				input[j] = input[i];
				System.out.println(Arrays.toString(input));
				System.out.println("");
			}
			/** Second Block End **/
		}
		
		input[j] = pivot;
		return j;
	}

}
