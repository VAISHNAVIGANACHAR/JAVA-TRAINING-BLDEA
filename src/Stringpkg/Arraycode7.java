package Stringpkg;

import java.util.Scanner;

public class Arraycode7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine(); 
		
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' '|| i==str.length()-1 ) 
			{
				//to find total number of words in given string
				count++;
		}
		
		
	}
	System.out.println("word count : "+count);
} 
}
