package trainingcode;

import java.util.Scanner;

public class stringcode 
 
	{
	public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string:");
		String str=sc.next();
		str=str.toLowerCase();
	
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||
					str.charAt(i)=='o' ||str.charAt(i)=='u')
			{
				System.out.println("@");
			}
			else
			{
				System.out.println(str.charAt(i));
			}
	

	}
	}

}
