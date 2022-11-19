package com.constructors;

//Write a program create a class ‘simpleobject‘. Using constructor display 
//the message.



class SimpleObject 
 { 
 SimpleObject() 
 { 
 System.out.println ("No argument Constructor"); 
 } 
 SimpleObject(int a) 
 { 

 System.out.println ("One argument Constructor"); 
 } 
}
public class ConstructorEx {
	public static void main(String arg[]) 
	 { 
	 new SimpleObject(); 
	 new SimpleObject(100); 
	 } 

}
