package selenium.Workout;

public class Day1PalindromeOfString {
	
	/* Question 2:
	 * Check for the palindrome of the given string: Input: "malayalam" output: Yes,
	 * Palindrome Input: "testleaf" output: No, not a palindrome
	 */
public static void main(String[] args) {
	
	String str = "malayalam";
	StringBuffer sb = new StringBuffer(str);
	String reverse =sb.reverse().toString();
	if (str.equals(reverse))
	System.out.println("Given String is palindrome");
	else
	System.out.println("Given String is not palindrome");
	}

}
	
	

