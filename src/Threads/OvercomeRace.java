package Threads;

class TypingOps2 extends Thread
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
class SpellCheckOps2 extends Thread
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

class SavingOps2 extends Thread
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


public class OvercomeRace
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		TypingOps2 tp=new TypingOps2();
		SpellCheckOps2 sp=new SpellCheckOps2();
		SavingOps2 sv=new SavingOps2();
		sp.setDaemon(true);
		sv.setDaemon(true);
		sp.setPriority(8);
		sv.setPriority(9);
		
		System.out.println("main terminated");
	}

}
