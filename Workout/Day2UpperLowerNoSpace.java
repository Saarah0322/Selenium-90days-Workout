package selenium.Workout;

public class Day2UpperLowerNoSpace {
	/*
	3. Write a java program to find the number of Uppercase, lowercase, numbers and spaces in the following String.
	Input: "1. It is Work from Home  not Work for Home"*/
	
	  public static void main(String args[]) 
	    { 
	        String str = "1. It is Work from Home  not Work for Home"; 
	        int upper = 0, lower = 0, number = 0, spaces = 0; 
	  
	        for(int i = 0; i < str.length(); i++) 
	        { 
	            char ch = str.charAt(i); 
	            if (ch >= 'A' && ch <= 'Z') 
	                upper++; 
	            else if (ch >= 'a' && ch <= 'z') 
	                lower++; 
	            else if (ch >= '0' && ch <= '9') 
	                number++; 
	            else
	                spaces++; 
	        } 
	  
	        System.out.println("Lower case letters : " + lower); 
	        System.out.println("Upper case letters : " + upper); 
	        System.out.println("Number : " + number); 
	        System.out.println("Spaces : " + spaces); 
	    } 
	}


