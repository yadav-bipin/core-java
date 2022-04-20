package com;

/*
 * Session 2 
 * Encapsulation
 * Inheritance : 1) IS-A relationship 2) HAS-A relationship
 * 
 * 
 * 
 * 
 * */




class WithDraw{
	 int amt_withdraw = 5000;
}

class Atm extends WithDraw {
	
	int amt_left = 10000;
	
	
	public static void main(String [] args)
	{
		Atm obj = new Atm();
		
		System.out.println("Amount WithDraw " + obj.amt_withdraw);
		System.out.println("Amount Left " + obj.amt_left);
		
		
	}
	
	
}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
