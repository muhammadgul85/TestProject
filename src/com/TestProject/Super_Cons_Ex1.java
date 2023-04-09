package com.TestProject;


class Alpha22

{
	Alpha22 (int a, int b)
	{
		System.out.println("A: "+a + " B:" +b);
	}
	
	Alpha22 (long a, long b)
	{
		System.out.println("long A: "+ a + " long B:" + b);
	}
}


class Zolo34 extends Alpha22
{

	Zolo34(int a, int b) {
		super(10, 20);
		// TODO Auto-generated constructor stub
	}
	
}
public class Super_Cons_Ex1 {
	public static void main(String[] args) {
		
		Zolo34 z = new Zolo34 (20, 2);
		
		
		
	}
}
