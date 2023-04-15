package trainingcode;

import java.util.Scanner;

abstract class Shapes
{
	double area;
	abstract void collect();
	abstract void calculate();
	void display()
	{
		System.out.println(area);
	}
}

class Circle extends Shapes
{
	double pi=3.147;
	double r;
	void collect()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		r=sc.nextDouble();
		
}

	void calculate()
	{
		area=pi*r*r;
	}
}

class Rectangle extends Shapes
{
	double l,b;
	void collect()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		l=sc.nextDouble();
		System.out.println("enter breadth");
		b=sc.nextDouble();
	}
	void calculate()
	{
		area=l*b;
	}
}

class Square extends Shapes
{
	double side;
	void collect()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side");
		side=sc.nextDouble();
		
			
		}
	void calculate()
	{
	area=side*side;
	}
}
class Geometry
{
	void permit(Shapes s)
	{
		s.collect();
		s.calculate();
		s.display();
		
	}
}
public class DEMO 
{
	public static void main(String[] args) 
	{
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Square s=new Square();
		Geometry g=new Geometry();
		g.permit(c);
		g.permit(r);
		g.permit(s);
	}
}