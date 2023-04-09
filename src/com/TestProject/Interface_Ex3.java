package com.TestProject;

interface printable1
{
	void print (); //abstract method, non implemented
}
interface showable1 extends printable
{
	void show ();//abstract method, non implemented
}
class Testinterface4 implements showable1
{
	@Override
	public void print() {
		System.out.println("Printable Interface method : Print Implemented");		
	}
	@Override
	public void show() {
		System.out.println("showable Interface method : show Implemented");// TODO Auto-generated method stub		
	}	
}
public class Interface_Ex3 {
	public static void main(String[] args) {
		
		Testinterface4 aaa = new Testinterface4 ();
		aaa.print();
		aaa.show();
	}
}
