package com.intro.uptovariables;


/*5..Write a program to demonstrate static variables, methods, and blocks.*/ 
public class UseStatic {

	static int a=3; 
	 static int b; 
	 static void meth(int x) 
	{ 
	 System.out.println ("x =" +x); 
	 System.out.println ("a =" +a); 
	 System.out.println ("b =" + b); 
	 } 
	 static 
	 { 
	 System.out.println ("Static block Initialized"); 
	 b = a * 4; 
	 } 
	 public static void main (String args [ ]) 
	{ 
	 meth (42); 
	 }
}
