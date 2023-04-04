package trainingcode;
import java.util.*;

public class Arraycode6 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("string1:");
		String s1=sc.next();
		System.out.println("string2:");
		String s2=sc.next();
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Anagrams");
		}
			else
			{
				System.out.println("not anagrams");
			}
		}
		
	}


