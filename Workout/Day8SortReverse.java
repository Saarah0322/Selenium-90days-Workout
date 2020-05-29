package selenium.Workout;


import java.util.Arrays;


public class Day8SortReverse {
	
  // PROGRAM:
	/* Write a java program to sort it and reverse it. 
	 * Input: int[] array = {5,1,33,79,22,11,45}; 
	 * output: 
	 * Sorted: {1,5,11,22,33,45,79} 
	 * reversed: {79,45,33,22,11,5,1}
	 */
	

	public static void main(String[] args) {
		
		 // For 1st method input is below
		 int[] array = {5,1,33,79,22,11,45};
		 
		 Arrays.sort(array);
	
	   for (int i = 0; i < array.length; i++)
	   {
		 // Sorted output:
		 System.out.print(array[i]+" ");        
		 }
		 System.out.println();
		 for (int i = array.length-1; i>=0; i--) 
		 {
		 // Reverse output
		 System.out.print(array[i]+" ");        
		 }
	  
		 
		 		 
}
}

