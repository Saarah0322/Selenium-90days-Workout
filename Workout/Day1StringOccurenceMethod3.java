package selenium.Workout;

public class Day1StringOccurenceMethod3 {
	
	/* Question:
	 * 1. Write a Java Program to find the occurence of the character 'o' in the
	 * following String. Input: "You have no choice other than following me!"
	 * output: Occurence of o is: 6
	 */
		public static void main(String[] args) {
		
		String str = "You have no choice other than following me!";
		int count=0;
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			if(charArray[i]=='o')
			{
				count = count+1;
			}
			
			}
		System.out.println("Occurence of o is:" +count);
		
	}

}

