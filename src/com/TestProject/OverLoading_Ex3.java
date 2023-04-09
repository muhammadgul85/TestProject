package com.TestProject;

//Method OverLoading Exercise
//Same Method Different Signatures

class alpha33
{
	public void test1()
	{
		System.out.println("Hello this is method overloading ex");
	}
	
	public void test1(String a, String b)
	{
		System.out.println(a+b); 
	}
	
	public void test1(String a, int b)
	{
		System.out.println("String a: "+a + " "+ "Number: "+b);
	}
	
	public void test1 (double a, float b)
	{
		System.out.println("double a : " + a + " float b: " + b);
	}
}





public class OverLoading_Ex3 {
	public static void main(String[] args) {
		
		alpha33 overL = new alpha33 ();
		overL.test1();
		overL.test1(12.22, 233.33f);
		overL.test1("Hello" , 29);
		overL.test1("Muhammad ", "Gul");
		
	}

}
