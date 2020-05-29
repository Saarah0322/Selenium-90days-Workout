package selenium.Workout;

public class Day10SwapNumbers {
	
	/*
	 * 1. Write a java program to swap two numbers Input: a = 5, b= 10 output: a =
	 * 10, b = 5 (Note: Try without the third variable)
	 */

		public static void main(String[] args) {
			int a=5;
			int b=10;
		
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("b=" + b + "->" + "a=" + a);
		}

	}
