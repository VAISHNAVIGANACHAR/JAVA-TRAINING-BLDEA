package trainingcode;
import java.util.Scanner;

public class Arraycode7
{
public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String str=sc.nextLine(); 
		    String  str_tmp="";

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

	String arr[]=new String[count];
	int tmp=0;
	for(int i=str.length()-1;i>=0;i--)
	{
		if(str.charAt(i)!=' ')
		{
			str_tmp=str_tmp+str.charAt(i);
		}
		
		else
		{
			arr[tmp]=str_tmp;
			tmp++;
			str_tmp="";
		}
		}
	arr[tmp]=str_tmp;

	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
	}
	}


