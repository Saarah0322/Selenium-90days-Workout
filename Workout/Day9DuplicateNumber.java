package selenium.Workout;

import java.util.Arrays;

public class Day9DuplicateNumber {

	/*
	 * Write a java programs to print the duplicate items in the array int[]
	 * my_array = {1, 2, 5, 5, 6, 6, 7, 2}; What is the difference between int and
	 * Integer and for other datatypes also.
	 */

	
	public static void main(String[] args) {
		int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 };
		//Method 1
		Arrays.sort(my_array);
		for (int i = 0; i < my_array.length - 1; i++) {
			if (my_array[i] == my_array[i + 1]) {
				System.out.println(my_array[i]);
			}
		}
		
		
}
}
