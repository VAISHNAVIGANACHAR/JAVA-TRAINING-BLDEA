
package Threads;
import java.util.Scanner;
public class Threadexp1 
{
	public static void main(String[] args)
	{
	System.out.println("addition operation");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num1");
	int num1=sc.nextInt();
	System.out.println("enter num2");
	int num2=sc.nextInt();
	int res=num1+num2;
	System.out.println(res);
	System.out.println("addition completed");
	System.out.println("printing operation");
	for(int i=1;i<=5;i++)
	{
		try
		{
			System.out.println("csk forever");
			Thread.sleep(2000);
		}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
	}
		
		System.out.println("printing completed");
		System.out.println("banking operation");
		System.out.println("enter accno");
		int accn0=sc.nextInt();
		System.out.println("enter pin");
		int pin=sc.nextInt();
		System.out.println("printing completed");
	}

}
