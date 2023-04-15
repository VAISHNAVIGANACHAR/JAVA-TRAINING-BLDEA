 package com.bldea.crorepathiapp.package1;

import java.util.Scanner;

public class CrorepathiApp {

	public static void main(String[] args)throws Exception
	{
		System.out.println("welcome to kannadad kotyadhipathi");
		System.out.println("lets welcome our first candidate");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is your name?");
		String name =sc.next();

		System.out.println("what is your age");
		int age =sc.nextInt();

		System.out.println("what is your city");
		String city =sc.next();

		System.out.println("what is your state");
		String state =sc.next();
		
		candidate c1=new candidate(name,age,city,state);
		
				
		System.out.println("Congratulations for making it till here Mr/Ms."+c1.getName());
		System.out.println("The rules of the game:");
		System.out.println("1. there will be 10 questions which rewaards a specific amount in"+"incrementtal order");
		System.out.println("2. the game will contain 3 life lines");
		System.out.println("3. you can quit the game any stage ");
		
		System.out.println("please type 1 if you wish to see the reward per question.elsetype any key other key");
		int type_1=sc.nextInt();
		if(type_1==1)
		{
			System.out.println("Question-1:1000\n"+
					           "Question-2:5000\n"+  
					           "Question-3:10000\n"+
					           "Question-4:20000\n"+
					           "Question-5:40000\n"+  
					           "Question-6:50000\n"+
					           "Question-7:100000\n"+
					           "Question-8:500000\n"+
					           "Question-9:750000\n"+
					           "Question-10:1000000\n");
			System.out.println("Do you wish to continue??(type: YES/NO)"); 
		}
		else
		{
			System.out.println("Do you wish to continue??(type: YES/NO)"); 
		}
			String type_2=sc.next();
			
			if(type_2.equalsIgnoreCase("yes")==true)
				
			{
				System.out.println("Lets Begin the Game");
				System.out.println("Here is the first question,");
	            boolean res1= question.fetchQuestion1(c1.getName());
	            
	            if(res1==true)
	           {
	            	System.out.println("Congratulations!!your answer is correct.\n"
	                +"you have won Rs."+c1.getAmount());
	            	System.out.println("Here is your next question");
	            	boolean res2= question.fetchQuestion2(c1.getName());
	            	
	            	if(res2==true)
	     
	                  {
	            		System.out.println("Congratulations!!your answer is correct.\n"
	            	    +"you have won Rs."+c1.getAmount());
	            		System.out.println("Here is your next question");
	            		boolean res3= question.fetchQuestion3(c1.getName());
		            	
	            		if(res3==true)
		            	{
		            		System.out.println("Congratulations!!your answer is correct.\n"
		            	    +"you have won Rs."+c1.getAmount());
		            		System.out.println("Here is your next question");
		            		boolean res4= question.fetchQuestion4(c1.getName());
			            	
		            		if(res4==true)
			            	{
			            		System.out.println("Congratulations!!your answer is correct.\n"
			            	    +"you have won Rs."+c1.getAmount());
			            		System.out.println("Here is your next question");
			            		boolean res5= question.fetchQuestion5(c1.getName());
				            	
			            		if(res5==true)
				            	{
				            		System.out.println("Congratulations!!your answer is correct.\n"
				            	    +"you have won Rs."+c1.getAmount());
				            		System.out.println("Here is your next question");
				                    boolean res6= question.fetchQuestion6(c1.getName());
					            	
				            		if(res6==true)
					            	{
					            		System.out.println("Congratulations!!your answer is correct.\n"
					            	    +"you have won Rs."+c1.getAmount());
					            		System.out.println("Here is your next question");
					                    boolean res7= question.fetchQuestion7(c1.getName());
						            	
					            		if(res7==true)
						            	{
						            		System.out.println("Congratulations!!your answer is correct.\n"
						            	    +"you have won Rs."+c1.getAmount());
						            		System.out.println("Here is your next question");
						            		
						            		boolean res8= question.fetchQuestion8(c1.getName());
							            	
						            		if(res8==true)
							            	{
							            		System.out.println("Congratulations!!your answer is correct.\n"
							            	    +"you have won Rs."+c1.getAmount());
							            		System.out.println("Here is your next question");
							                 }
						                    boolean res9= question.fetchQuestion9(c1.getName());
						            	
					            		if(res9==true)
						            	{
						            		System.out.println("Congratulations!!your answer is correct.\n"
						            	    +"you have won Rs."+c1.getAmount());
						            		System.out.println("Here is your next question");
						                    boolean res10= question.fetchQuestion10(c1.getName());
							            	
						            		if(res10==true)
							            	{
							            		System.out.println("Congratulations!!your answer is correct.\n"
							            	    +"you have won Rs."+c1.getAmount());
							            		System.out.println("Here is your next question");
							                 }
							            	else
							            	{
							            		System.out.println("We are sorry!! your Answer is incorrect.\n"
							            				+"you have won Rs."+c1.getAmount());
							            	}
							            
						                 
						                 
						                 }
						            	else
						            	{
						            		System.out.println("We are sorry!! your Answer is incorrect.\n"
						            				+"you have won Rs."+c1.getAmount());
						            	}
						            
					                 
					                 }
						            	else
						            	{
						            		System.out.println("We are sorry!! your Answer is incorrect.\n"
						            				+"you have won Rs."+c1.getAmount());
						            	}
						            
					                 
					                 }
					            	else
					            	{
					            		System.out.println("We are sorry!! your Answer is incorrect.\n"
					            				+"you have won Rs."+c1.getAmount());
					            	}
					            }
				                 
				                 
				            	else
				            	{
				            		System.out.println("We are sorry!! your Answer is incorrect.\n"
				            				+"you have won Rs."+c1.getAmount());
				            	}
				            }
			                 
			            	else
			            	{
			            		System.out.println("We are sorry!! your Answer is incorrect.\n"
			            				+"you have won Rs."+c1.getAmount());
			            	}
			            }
		       	         else
		            	{
		            		System.out.println("We are sorry!! your Answer is incorrect.\n"
		            				+"you have won Rs."+c1.getAmount());
		            	}
		            
	       	         
	            	}
	            	else
	            	{
	            		System.out.println("We are sorry!! your Answer is incorrect.\n"
	            				+"you have won Rs."+c1.getAmount());
	            	}
	               }
	            	else
	            	{
	            		System.out.println("We are sorry!! your Answer is incorrect.\n"
	            				+"you have won Rs."+c1.getAmount());
	            	}
	            	}	
	         else
			{
				System.out.println("Thank you for coming,All the best!!");
			}
		}

}
