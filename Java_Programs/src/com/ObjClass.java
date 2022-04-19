package com;

public class ObjClass {
	
	int yearofpurchase; // data members
	String model;  // data members
	double cost;   // data members
	
	
	//  methods 
	
	public void disp1()
	{
		System.out.println("Year of purchase" + 2000);
		
	}
	
	public void disp2()
	{
		System.out.println("Model " + 1999);
		System.out.println("Cost Rs." + 199999);

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjClass obj1 = new ObjClass();
		ObjClass obj2 = new ObjClass();
		
		
		// object 1 of class ObjClass
		obj1.disp1();
		obj1.disp2();
		
		// object 2 of class ObjClass
		obj2.disp1();
		obj2.disp2();
				
		

	}

}
