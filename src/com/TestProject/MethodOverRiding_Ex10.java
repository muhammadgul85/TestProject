package com.TestProject;
//Same method same signature but different implementation is called a method over riding 
//and we can achieve this with inheritance


class A 
{
	public void test1()
	{
		System.out.println("Parent Method: This is to test OverRiding");
	}
}

class B extends A
{
	public void test1()
	{
		System.out.println("Child Method: This is to test overriding");
	}
}



public class MethodOverRiding_Ex10 {
	public static void main(String[] args) {
		//upcasting takes place, check below
		
		A overR = new B ();//new B(), OverCasting
		overR.test1();
		
		//normally we create object of Class and call the method
		A objA = new A();
		objA.test1();
		
	}

}
