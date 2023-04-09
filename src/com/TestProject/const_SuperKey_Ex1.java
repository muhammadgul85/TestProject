package com.TestProject;


class Abca 
{
	Abca (int a)
	{
		System.out.println("cons Abc: " +a);
	}
	
	void abcmethod ()
	{
		System.out.println("abcmethod");
	}
}

class Cba extends Abca
{

	Cba(int a) {
		super(10);
		// TODO Auto-generated constructor stub
		System.out.println("calling Cba: " +a );
	}
	
}

public class const_SuperKey_Ex1 {
	public static void main(String[] args) {
		
		Cba c = new Cba (5);
		
		
		
	}

}
