package Java_Revision_Ex1;

class Testing1 
{
	public void demo (int a)
	{
		System.out.println("method1: Value of int a: " + a);
	}
	public void demo (int a, int b)
	{
		System.out.println("method2: Value of a "+a + " value of b: "+ b);
	}
	public void demo (String a)
	{
		System.out.println("Method3: value of String a: "+a);
		
	}
	public void demo(float a, double b)
	{
		System.out.println("Method 4: Value of float a: "+ a +" Value of double b " + b);
	}
	
	
}



public class CompileTimePolymorphism_Ex1 {
	public static void main(String[] args) {
		
		
		Testing1 bb = new Testing1 ();
		bb.demo(10);
		bb.demo(44, 4);
		bb.demo("Hello");
		bb.demo(444.444f, 444);
		
		
		
	}
}
