package selenium.Workout;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Day6RemoveDuplicateList {

	public static void main(String[] args) {
		/*
		 * How to remove duplicates from a list? List = "A,B,C,D,A,D,E,F"
		 */
			
		List<Character> lst = new ArrayList<Character>();
		lst.add('A');
		lst.add('B');
		lst.add('C');
		lst.add('D');
		lst.add('A');
		lst.add('D');
		lst.add('E');
		lst.add('F');
		//Method1
		Set<Character> uniqueSet = new LinkedHashSet<Character>(lst);
		System.err.println(uniqueSet);
			}
		

	}

