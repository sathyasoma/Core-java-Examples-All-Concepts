package com.assignments;

//2.1Write a program to print the following triangle of binary digits. 
public class BinaryTriangle {

	public static void main (String arg [ ] ) 
	 { 
	 String k = "1", l = " " , s = "1"; 
	 int m = 0; 
	 int n = 5; //* if necessary change the value of n** // 
	 for (int i = 0; i < n; i++) 
	 { 
	 for (int j = 1; j < m; j++) 
	 { 
	l+= " 0 "; 
	 } 
	 System.out.println (k + l + s + "\n"); 
	 l = " "; 
	 m += 2; 
	 } 
	 } 
}
