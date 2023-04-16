package Threads;
import java.util.Scanner;
class Addition extends Thread
{
	public void run()
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
	}
}
	class Printing extends Thread
	{
		public void run()
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
		}
	}
		class banking extends Thread
		{
			public void run()
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
			}

		}

public class Threadex2
{
	public static void main(String[] args)
	{
	System.out.println("main stared");
	Addition ad=new Addition();
	System.out.println(ad);
	Printing pr=new Printing();
	System.out.println(pr);
	banking bn=new banking();
	System.out.println(bn);
	
	ad.start();
	pr.start();
	bn.start();
	System.out.println("main terminated");
	}
}
