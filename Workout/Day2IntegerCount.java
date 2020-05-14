package selenium.Workout;

public class Day2IntegerCount {

	public static void main(String[] args) {
		
		/*
		 * 1. Write a java code to find the sum of the given numbers Input:
		 * "asdf1qwer9as8d7" output: 1+9+8+7 = 25
		 */

		int sum=0;
		String str = "asdf1qwer9as8d7";
		for(int i=0; i<str.length(); i++) {
		    char ch = str.charAt(i);
		    if (Character.isDigit(ch)) {
		        int b = Integer.parseInt(String.valueOf(ch));
		        sum=sum+b;
		    }
		}
		System.out.println(sum);

	}

}
