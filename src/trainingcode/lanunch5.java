package trainingcode;
class lion
{
	private String name;
	private String color;
	private int cost;

    
	void setData(String a,String b,int c) 
    {
      this.name=name;
      this. color=color;
      this. cost=cost;
    }
     
    void getData()
    {
    	System.out.println(name);
    	System.out.println(color);
    	System.out.println(cost);
    }
   
    }

public class lanunch5
{
	public static void main(String[] args) 
	{
		lion l1=new lion();
		l1.setData("blacky","black",7000);
		l1.getData();
		
	}

}