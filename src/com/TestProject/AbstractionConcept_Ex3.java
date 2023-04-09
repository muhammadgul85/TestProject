package com.TestProject;
//We will create Central Bank and associated banks will give loans on different rates

abstract class CentralBank
{
	abstract int getRateofInterest();
}

class BankA extends CentralBank
{

	@Override
	int getRateofInterest() {
		
		return 7;
	}
	
}
class BankB extends CentralBank
{

	//what is the purpose of override ? Is it just indicator?
	@Override
	int getRateofInterest() {
		// TODO Auto-generated method stub
		return 9;
	}
	
}
abstract class USA 
{
	public void Politicia ()
	{
		System.out.println("Politics is Dirty, it divides people");
	}
	abstract void Politics();
}

class World extends USA
{    
	//override not required ?
	public void Politics()
	{
		System.out.println("Good Politicians have to join in ");
	}
}

public class AbstractionConcept_Ex3 {
	public static void main(String[] args) {
		//CentralBank DD;
		USA poly;
		
		BankA DD = new BankA ();
        System.out.println("Rate of Interest for BankA is:" + DD.getRateofInterest()+ " %");
		
        BankB DD1 = new BankB();
        System.out.println("Rate of Interest for BankB is: "+ DD1.getRateofInterest()+ " %");
        
        
        poly = new World ();
        //why can we print it ?
        //System.out.println("Isn't it polymorphism: "+ poly.Politics());
        poly.Politics();
              
	}

}