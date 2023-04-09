package com.TestProject;

 abstract class Bike
{
	abstract void run();//abstract method doesn't have body, 
}

class car extends Bike
{
	public void run()
	{
		System.out.println("Car running Safely");
	}
}

class Cycle extends Bike
{

	@Override
	void run() {
		System.out.println("Bike is quicker");
		
	}
	
}

public class AbstractionConcept_Ex2 {
	public static void main(String[] args) {
	
		
		car abc = new car();
		abc.run();
		
		Cycle def = new Cycle();
		def.run();
	
	}

}
