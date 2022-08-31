package section3;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		mergeSort(intArray, 0 , intArray.length);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	public static void mergeSort(int[] input, int start, int end) {
		if (end - start < 2) {
			return;
		}
		
		int mid = (start + end) / 2;
		mergeSort(input, start, mid);
		mergeSort(input, mid, end);
		merge(input, start, mid, end);
	}
	
	public static void merge(int[] input, int start, int mid, int end) {
		// Change to greater than for descending (1)
		if (input[mid - 1] < input[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		int[] temp = new int[end - start];
		while (i < mid && j < end) {
			// Change to greater than or equal for descending (2)
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}
		
		
		
		System.out.println(start);
		System.out.println(mid);
		System.out.println(end);
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(input));
		System.out.println("");
		
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, input, start, tempIndex);
	}

}
