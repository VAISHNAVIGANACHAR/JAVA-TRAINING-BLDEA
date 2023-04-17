package Threads;

class TypingOps3 extends Thread
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
class SpellCheckOps3 extends Thread
{
	@Override
		public void run()
		{
			for(; ;)
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

class SavingOps3 extends Thread
{
	@Override
		public void run()
		{
			for(; ;)
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


public class join
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("main started");
		TypingOps3 tp=new TypingOps3();
		SpellCheckOps3 sp=new SpellCheckOps3();
		SavingOps3 sv=new SavingOps3();
		
		sp.setDaemon(true);
		sv.setDaemon(true);
		sp.setPriority(8);
		sv.setPriority(9);
		tp.start();
		tp.join(1000);
		sp.start();
		sp.join();
		sv.start();
		
		System.out.println("main terminated");
	}

}