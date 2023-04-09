package com.TestProject;

public class Compound_Ex1 {
	public static void main(String[] args) {
		
		
		byte b = 120; 
        b += 10; 
        byte b1 = 120; 
        b1 *= 10; 
        short s = 330; 
        s -= 30; 
        //how does the compound Work ?
        byte b2 = 127; 
        b2 %= 7; 
        byte b3 = 120; 
        b3 &= 40; 
        short s1 = 300; 
        s1 ^= 100; 
        byte b4 = 127; 
        b4 >>= 3; 
        short s2 = 200; 
        s2 <<= 3; 
        short s3 = 300; 
        s3 >>= 4; 
        System.out.println("b: "+ b); 
        System.out.println("b1: "+b1); 
        System.out.println("b2: "+b2); 
        System.out.println("b3" +b3); 
        System.out.println("b4" +b4); 
        System.out.println("s: "+ s); 
        System.out.println("s1: " +s1); 
        System.out.println("s: "+s2); 
        System.out.println("s3: "+s3); 
		
		
		
	} 

}
  