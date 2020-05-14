package selenium.Workout;

public class Day2AlternateStringReverse {

	public static void main(String[] args) {
		
		/* PROGRAM:
	    Write a java program to do the following.
		Input: "When the world realise its own mistake, corona will dissolve automatically"
		output: "When eht world esilaer its nwo mistake, anoroc will evlossid automatically"
	*/
		
	
	String text = "When the world realise its own mistake, corona will dissolve automatically";
	String[] split = text.split("\\s");
	StringBuffer sb = new StringBuffer();
	for (int i = 0; i < split.length; i++) {
		if(i % 2 !=0) {
			sb.append(" ").append(new StringBuffer(split[i]).reverse());
		}
		else {
			sb.append(" ").append(new StringBuffer(split[i]).append(" "));
		}
	}
		System.out.println(sb);
}
}


