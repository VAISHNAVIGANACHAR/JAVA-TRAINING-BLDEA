package trainingcode;

import java.util.Scanner;

public class stringcode 
 
	{
	public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string-1:");
		String str1=sc.nextLine();
		str1=str1.toLowerCase();
		int cons=0;
		for(int i=0;i<str1.length()-1;i++)
		{
			if(str1.charAt(i)=='a' ||str1.charAt(i)=='e' ||str1.charAt(i)=='i' ||
					str1.charAt(i)=='o' ||str1.charAt(i)=='u')
			{
				System.out.print("@");
			}
			else
			{
				System.out.print("str1");
			}
	

	}
	}

}
