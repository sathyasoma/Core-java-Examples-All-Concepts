package com.constructors;

import java.util.Scanner;

/*An electronics shop has announced a special discount on the purchase of Laptops as given below:
Category	Discount on Laptop
Up to ₹25,000	        5.0%
₹25,001 - ₹50,000	7.5%
₹50,001 - ₹1,00,000	10.0%
More than ₹1,00,000	15.0%

Define a class Laptop described as follows:

Data members/instance variables:

name
price
dis
amt
Member Methods:

A parameterised constructor to initialize the data members
To accept the details (name of the customer and the price)
To compute the discount
To display the name, discount and amount to be paid after discount.
Write a main method to create an object of the class and call the member methods.*/

public class Laptop {
	
	 private String name;
	    private int price;
	    private double dis;
	    private double amt;

	    public Laptop(String s, int p)
	    {
	        name = s;
	        price = p;
	    }

	    public void compute() {
	        if (price <= 25000)
	            dis = price * 0.05;
	        else if (price <= 50000)
	            dis = price * 0.075;
	        else if (price <= 100000)
	            dis = price * 0.1;
	        else
	            dis = price * 0.15;
	            
	        amt = price - dis;
	    }
	    
	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Discount: " + dis);
	        System.out.println("Amount to be paid: " + amt);
	    }
	    
	    public static void main(String args[]) {
	        
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter Customer Name: ");
	        String str = in.nextLine();
	        System.out.print("Enter Price: ");
	        int p = in.nextInt();
	        
	        Laptop obj = new Laptop(str,p);
	        obj.compute();
	        obj.display();
	    }

}
