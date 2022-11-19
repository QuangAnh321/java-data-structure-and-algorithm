package section8;

public class LinearSearch {

	public static void main(String[] args) {
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		System.out.println(linearSearch(intArray, 35));
		System.out.println(linearSearch(intArray, -22));
	}
	
	public static int linearSearch(int[] input, int valueToSearch) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] == valueToSearch) {
				return i;
			}
		}
		
		return -1;
	}

}
