package exceptioncodes;
import java.util.Scanner;

public class launch 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter numerator");
			int num1=sc.nextInt();
			System.out.println("enter denominator");
			int num2=sc.nextInt();
			int num = 10 ;
			int deno=5;
			int res=num/deno; 
			System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is generated");
		}
		}
	}
