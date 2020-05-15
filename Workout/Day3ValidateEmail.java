package selenium.Workout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3ValidateEmail {
	
	/*
	 * 2. Write a java program to validate the given username is valid or not Input:
	 * "Balaji_1" output: false Input: "Testleaf$123" output: false Note: 1. It
	 * should contain minimum 8 characters. 2. It allows alpha numeric characters
	 * and spl characters like . _ @ $
	 */

	public static void main(String[] args) {
		
		//String str = "balaji.chandrasekaran@testleaf.com";
		//String str = "balaji.c@tunatap.co.uk";
		String str = "naveen e@tl.com";
		String pattern = "[a-zA-Z0-9._]+@[a-z0-9]+.[a-z.]{2,}";		
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		System.out.println(matcher.matches());
		}

	}


