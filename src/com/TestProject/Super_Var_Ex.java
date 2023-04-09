package com.TestProject;

class Animal

{
	String color = "Black";
}


class Cat extends Animal 
{
	String color = "White";
	
	
	public void display ()
	{
		System.out.println("local: " + color);
		System.out.println("parent: " +super.color);
	}
	
}


public class Super_Var_Ex {

	
	public static void main(String[] args) {
		Cat c = new Cat ();
		c.display();
		
	}
}
