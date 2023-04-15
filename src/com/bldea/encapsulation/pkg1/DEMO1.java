package com.bldea.encapsulation.pkg1;


class plane
{
void takeoff()
{
	System.out.println("palne took off");
}

void fly()
{
	System.out.println("plane is flying");
}
void land()
{
	System.out.println("plane landed");
}
}

class CargoPlane extends plane
{
	void fly()
	{
		System.out.println("cargo palne is flying at low heights");
	}
	void carrygoods()
	{
		System.out.println("cargo palne carry the goods");
	}
}

class FighterPlane extends plane
{
	void fly()
	{
		System.out.println("fighter palne is flying at greater heights");
	}
	void carryweapons()
	{
		System.out.println("fighter palne carry the weapons");
	}
}

class PassengerPlane extends plane
{
	void fly()
	{
		System.out.println("passenger palne is flying at midium heights");
	}
	void carrypassengers()
	{
		System.out.println("passenger palne carry the passengers");
	}
}

public class DEMO1
{
	public static void main(String[] args) {
		
		CargoPlane cp=new CargoPlane();
		FighterPlane fp=new FighterPlane();
		PassengerPlane pp=new PassengerPlane();
		
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carrygoods();
		System.out.println("----------");
		
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.carryweapons();
		System.out.println("----------");
		
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carrypassengers();
		System.out.println("----------");
	}
}

