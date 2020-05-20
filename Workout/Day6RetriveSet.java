package selenium.Workout;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Day6RetriveSet {

	public static void main(String[] args) {

		/*
		 * How to retrieve a value from a Set? Set = "1,2,3,4,5,6,7,8,9" retrieve and
		 * print only the value - 7
		 */
					
		Set<Integer> setlist = new LinkedHashSet<>();

		setlist.add(1);
		setlist.add(2);
		setlist.add(3);
		setlist.add(4);
		setlist.add(5);
		setlist.add(6);
		setlist.add(7);
		setlist.add(8);
		setlist.add(9);

		List<Integer> lst = new ArrayList<>(setlist);
		
		for (int i = 0; i < lst.size(); i++) {
			if (lst.contains(7)) {
				System.out.println(lst.get(lst.indexOf(7)));
				break;
			}
		}

	}
	}

 