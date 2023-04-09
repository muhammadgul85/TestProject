package com.TestProject;

class Abc
{
	public static void alpha ()
	{
		System.out.println("Static method Test");
	}
}



public class StaticConcept_Ex1 {
	static // this is static block, we want to execute it before main method for debugging purpose
	
	{
		System.out.println("Static method");
	}
	
	
	static void alpha1()
	{
		System.out.println("static method inside public class");
	}
	public static void main(String[] args) {
		
		//Abc aa = new Abc ();
		Abc.alpha();  // 
		alpha1();
		
	}

}
