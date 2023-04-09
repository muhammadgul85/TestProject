package com.TestProject;

interface printable
{
	void print();//abstract method - non implemented
}

interface showable
{
	void print1 (); //abstract method - non implemented
}

class TestofInterface implements printable,showable
{

	@Override
	public void print() {
		
		System.out.println("Hello");
	}

	@Override
	public void print1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Interface_Ex2 {
	public static void main(String[] args) {
		
		TestofInterface abc = new TestofInterface ();
		abc.print();
		
	}

}
