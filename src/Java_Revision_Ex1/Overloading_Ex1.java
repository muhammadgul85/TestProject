package Java_Revision_Ex1;

class test1
{
	public void test()
	{
		System.out.println("Function 1");
	}
	
	public void test(int a, String b)
	{
		System.out.println("int: " +a+ " "+ "String: "+ b);
	}
	
	public void test (double a, int b)
	{
		System.out.println("double: "+a + " "+ "int: "+b);
	}
	
	public void test (long a, int b)
	{
		System.out.println("long: "+a + " "+ "double: "+b);
	}
}
public class Overloading_Ex1 {
	public static void main(String[] args) {
		
		test1 aa = new test1();
		aa.test();
		aa.test(10, "Rupees");
		aa.test(11.22, 22);
		aa.test(22.4444, 33);
		
		
		
	}

}
