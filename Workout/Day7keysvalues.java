package selenium.Workout;

import java.util.HashMap;
import java.util.Map;

public class Day7keysvalues {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        

        // Get keys and values
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + "--> " + v);
        }
  

    }


	}


 