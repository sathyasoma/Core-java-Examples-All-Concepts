package com.intro.uptovariables;

//Write a Java program to display default value of all primitive data types of java
public class Default {

	private short s; 
	 private int i; 
	 private long l; 
	 private float f; 
	 private double d; 
	 private char c; 
	 private String str; 
	 private boolean b; 
	public static void main (String args[ ]) 
	{ 
	 Default df = new Default( ); 
	 System.out.println ("\n short s = "+ df.s); 
	 System.out.println ("\n int i =" + df.i); 
	 System.out.println ("\n long l =" + df.l ); 
	 System.out.println ("\n float f =" + df.f); 
	 System.out.println ("\n double d =" + df.d); 
	 System.out.println ("\n char c =" + df.c); 
	 System.out.println ("\n String s =" + df.str); 
	System.out.println("\n boolean b =" + df.b); 
	 } 
}
