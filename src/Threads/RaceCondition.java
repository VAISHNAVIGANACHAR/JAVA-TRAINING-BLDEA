package Threads;
import java.util.Scanner;
class TypingOps extends Thread
{
	@Override
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				try
				{
					System.out.println("Typing......");
					Thread.sleep(2000);
				
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
class SpellCheckOps extends Thread
{
	@Override
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				try
				{
					System.out.println("spellchecking......");
					Thread.sleep(2000);
				
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

class SavingOps extends Thread
{
	@Override
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				try
				{
					System.out.println("saving......");
					Thread.sleep(2000);
				
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}


public class RaceCondition 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		TypingOps tp=new TypingOps();
		SpellCheckOps sp=new SpellCheckOps();
		SavingOps sv=new SavingOps();
		tp.start();
		sp.start();
		sv.start();
	}

}
