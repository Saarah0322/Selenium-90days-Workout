package selenium.Workout;

public class Day10FibonacciSeries {
	
	/*
	 * Print the first 10 fibonacci numbers in reverse order output:
	 * 34,21,13,8,5,3,2,1,1,0
	 */
	
		public static void main(String[] args) {
			int arr[] = new int[10];

			int n1 = 0, n2 = 1, n3 = 0;
			int count = 10;
			while (count > 0) {

				n3 = n1 + n2;
				System.out.println(n3);
				n1 = n2;
				n2 = n3;
				count--;
				arr[count] = n3;
			}
			System.out.println(arr.length);
			for (int i = 0; i < arr.length; i++) {
				System.out.println("*" + arr[i]);
			}

		}
	}


