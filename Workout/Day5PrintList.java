package selenium.Workout;

import java.util.ArrayList;
import java.util.List;

public class Day5PrintList {
	
	public static void main(String[] args) {
		
		/*
		 * Write a java program to print the list (Need 3 different answers) Input:
		 * [B,u,g,a,t,t,i, ,C,h,i,r,o,n]
		 */
		
		String str = "B,u,g,a,t,t,i, C,h,i,r,o,n";
		List<Character> lst = new ArrayList<Character>();
		for(int i = 0; i < str.length();i++) {
			lst.add(str.charAt(i));
		}
		
		for (Character eachChar : lst) {
			System.out.print(eachChar);
		}
	}

}
