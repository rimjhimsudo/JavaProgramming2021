/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogs2021;

/**
 *
 * @author lenovo
 */
// Java program to demonstrate implementation of Singleton 
// pattern using private constructors. 
import java.io.*; 

class MySingleton 
{ 
	static MySingleton instance = null; 
	public int x = 10; 
	
	// private constructor can't be accessed outside the class 
	private MySingleton() { } 

	// Factory method to provide the users with instances 
	static public MySingleton getInstance() 
	{ 
		if (instance == null)		 
			instance = new MySingleton(); 

		return instance; 
	} 
} 

// Driver Class 
class SingletonMain 
{ 
public static void main(String args[])	 
{ 
	MySingleton a = MySingleton.getInstance(); 
	MySingleton b = MySingleton.getInstance(); 
	a.x = a.x + 10; 
	System.out.println("Value of a.x = " + a.x); 
	System.out.println("Value of b.x = " + b.x); 
}	 
} 
