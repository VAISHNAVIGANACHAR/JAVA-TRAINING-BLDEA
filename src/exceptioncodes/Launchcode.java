package exceptioncodes;
import java.util.Scanner;
class operations
{
	void function1() throws ArithmeticException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numerator");
		int numerator=sc.nextInt();
		System.out.println("enter the denominator");
		int denominator=sc.nextInt();
		int res=numerator/denominator;
		System.out.println(res);
	}
}

public class Launchcode 
{
	public static void main(String[] args) 
	{
		try
		{
			operations op=new operations();
			op.function1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("main method handled the exception");
		}
		
	}

}
