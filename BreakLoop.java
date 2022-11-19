package com.assignments;

public class BreakLoop {

	 public static void main (String args [ ]) 
	 { 
	  int i= 0; 
	  do { 
	  System.out.println ("I’m stuck !" ) ; 
	  i++; 
	  if (i > 5) 
	  break; 
	  } while (true); 
	  } 
}
