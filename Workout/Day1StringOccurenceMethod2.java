package selenium.Workout;

public class Day1StringOccurenceMethod2 {
	
	/* Question:
	 * 1. Write a Java Program to find the occurence of the character 'o' in the
	 * following String. Input: "You have no choice other than following me!"
	 * output: Occurence of o is: 6
	 */
	//Method 1
		public static void main(String[] args) {
		
		String str = "You have no choice other than following me!";
		String replacedString = str.replaceAll("[^o]", "");
		System.out.println("Occurence of o is:" + replacedString.length());
		
	}
	
	}