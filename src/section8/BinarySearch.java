package section8;

public class BinarySearch {

	public static void main(String[] args) {
		int[] intArray = {-22,-15, 1, 7, 20, 35,  55};
		
//		System.out.println(iterativeBinarySearch(intArray, 7));
//		System.out.println(iterativeBinarySearch(intArray, 100));
		
		System.out.println(recursiveBirnarySearch(intArray, 7, 0, intArray.length));
		System.out.println(recursiveBirnarySearch(intArray, 100, 0, intArray.length));
	}
	
	public static int iterativeBinarySearch(int[] input, int value) {
		int start = 0;
		int end = input.length;
		
		while (start < end) {
			int midPoint = (start + end) / 2; 
			System.out.println("MidPoint: "+midPoint);
			if (input[midPoint] == value) {
				return midPoint;
			} else if (input[midPoint] < value) {
				start = midPoint + 1;
			} else {
				end = midPoint;
			}
		}
		
		return -1;
	}
	
	public static int recursiveBirnarySearch(int[] input, int value, int start, int end) {
		if (start >= end) {
			return -1;
		}
		
		int midPoint = (start + end) / 2; 
		System.out.println("MidPoint: "+midPoint);
		if (input[midPoint] == value) {
			return midPoint;
		} else if (input[midPoint] < value) {
			return recursiveBirnarySearch(input, value,  midPoint + 1, end);
		} else {
			return  recursiveBirnarySearch(input, value,  start, midPoint);
		}
	}

}
