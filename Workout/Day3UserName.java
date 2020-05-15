package selenium.Workout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3UserName {
	

	/*
	 * 1. Write a java program to verify whether the given String is valid email
	 * address. Input: "balaji.chandrasekaran@testleaf.com" output: true Input:
	 * "balaji.c@tunatap.co.uk" output: true Input: "naveen e@tl.com" output: false
	 * Note: Spl characters like . _ are only allowed
	 */

	public static void main(String[] args) {
		

		     String str = "Testleaf$123";
		     String pattern = "[a-zA-Z0-9._$@]{8,}";
			Pattern compile = Pattern.compile(pattern);
			Matcher matcher = compile.matcher(str);
			System.out.println(matcher.matches());
		}

	}


