package com.TestProject;


abstract class Alpha
{
	public void Entry()
	{
		System.out.println("Only with Valid ID");
	}
	
	abstract void Dress();
}


class Office extends Alpha
{

	@Override
	void Dress() {
		System.out.println("Entry to Office : No Informal Clothes");
		
	}
	
}
class Club extends Alpha
{

	@Override
	void Dress() {
		System.out.println("Entry to Club: You can wear what you like but no Trainers");
		
	}
	
}

class Mosque extends Alpha
{

	@Override
	void Dress() {
		System.out.println("Entry to Mosque: You got to wear reasonable clothes");
		
	}
	
}


abstract class Zolo
{
	public void zolo1 ()
	{
		System.out.println("This is test for abstract class ");
	}
}

class zol extends Zolo
{
	public void zolo2()
	{
		System.out.println("Testing");
	}
}

public class Abstraction_Concept_Ex1 {
	public static void main(String[] args) {
		
		zol zo = new zol();
		zo.zolo2();
		zo.zolo1();
		//System.out.println(zo.zolo1());
		
		
		
		
		
		//Alpha zz = new Alpha();  //Cannot create object of it
		// we can use upcasting, but no need 
		Office bb = new Office();
		bb.Entry();
		bb.Dress();
		System.out.println("******************");
		Club cc = new Club ();
		//bb.Entry();
		cc.Dress();
		System.out.println("******************");
		Mosque dd = new Mosque ();
		//bb.Entry();
		dd.Dress();
		System.out.println("******************");
	}

}
