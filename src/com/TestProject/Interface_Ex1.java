package com.TestProject;

interface interface_1
{
	void test1 (); 
}

interface interface_2
{
	void test2();
}

interface interface_3 extends interface_1, interface_2
{
	void test3();
}


class inter_1Class implements interface_1
{
	@Override
	public void test1() {
		System.out.println("Class 1 : This is the implementation of interface 1");
		
	}

}

class inter_2Class implements interface_2
{

	@Override
	public void test2() {
		System.out.println("Class 2: This is implementation of interface 2");
		
	}
	
}

class inter_3Class implements interface_3
{

	@Override
	public void test1() {
		System.out.println("Class 3: test 1 Method: This is implementation of interface 3 that inherits multiple interfaces");
		
	}

	@Override
	public void test2() {
		System.out.println("Class 3: test 2 Method: This is implementation of interface 3 that inherits multiple interfaces");

		
	}

	@Override
	public void test3() {
		System.out.println("Class 3: test 3 Method: This is implementation of interface 3 that inherits multiple interfaces");

		
	}
	
}
public class Interface_Ex1 {
	public static void main(String[] args) {
//		inter_1Class a ;  // you can do this way or the one being used below
//		inter_2Class b ;
//		inter_3Class c ;
		
		inter_1Class a= new inter_1Class();
		inter_2Class b= new inter_2Class();
		inter_3Class c= new inter_3Class();
		
		
		a.test1();
		
		b.test2();
		
		//Class 3 implemeted interface_3 which had inherited interface_1 & interface_2
		//Therefore we have 3 methods being called below
		c.test1();
		c.test2();
		c.test3();
	
		
	}

}
