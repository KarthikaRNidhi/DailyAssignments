package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1="stops";
		String str2="potss";
		
		//compare two strings length
        if (str1.length()==str2.length())
        {
			System.out.println("The length is equal, it is anagram");
			
		} 
        else 
		{
			System.out.println("The length is not equal, it is not a anagram");
	    } 
        
        //converting string to char array
        char[] chartext=str1.toCharArray();
        char[] chartext1=str2.toCharArray();
        
        //sorting a char arrays
        Arrays.sort(chartext);
        Arrays.sort(chartext1);
        
        //checking both the string are equal
        boolean result = Arrays.equals(chartext, chartext1);
        System.out.println(result);
        
        if(result)
        {
        	System.out.println("The given strings are Anagram");
        }
        else 
        {
        	System.out.println("The given strings are not an Anagram");
        }
        

	}
}

	    