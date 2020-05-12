package selenium.Workout;

import java.util.LinkedHashMap;
import java.util.Map;

public class Day1OccuranceofEachCharacter {
	
	/* Question:
	 * 1. Write a Java Program to find the occurence of the character 'o' in the
	 * following String. Input: "You have no choice other than following me!"
	 * output: Occurence of o is: 6
	 */
	
	public static void main(String[] args) {
		String text = "You have no choice other than following me!";
		char[] ch = text.toCharArray();
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		
			  for (char c : ch) {
			  
			  if(mp.containsKey(c)) { 
				  
				  mp.put(c, mp.get(c)+1);
				  } 
	else { 
		mp.put(c, 1); 
		}
	}
			  
			  System.out.println(text+ ":" + mp);
			 
	}
	}


