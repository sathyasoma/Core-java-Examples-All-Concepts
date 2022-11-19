package com.constructors;

import java.util.Scanner;

/*Define a class named FruitJuice with the following description:

Data Members	               Purpose
int product_code	stores the product code number
String flavour	        stores the flavour of the juice (e.g., orange, apple, etc.)
String pack_type	stores the type of packaging (e.g., tera-pack, PET bottle, etc.)
int pack_size	         stores package size (e.g., 200 mL, 400 mL, etc.)
int product_price	stores the price of the product

Member Methods	              Purpose

FruitJuice()	    constructor to initialize integer data members to 0 and string data members to ""
void input()	    to input and store the product code, flavour, pack type, pack size and product price
void discount()	    to reduce the product price by 10
void display()	    to display the product code, flavour, pack type, pack size and product price*/



public class FruitJuice {

	 private int product_code;
	    private String flavour;
	    private String pack_type;
	    private int pack_size;
	    private int product_price;
	    
	    public FruitJuice() {
	        product_code = 0;
	        flavour = "";
	        pack_type = "";
	        pack_size = 0;
	        product_price = 0;
	    }
	    
	    public void input() {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter Flavour: ");
	        flavour = in.nextLine();
	        System.out.print("Enter Pack Type: ");
	        pack_type = in.nextLine();
	        System.out.print("Enter Product Code: ");
	        product_code = in.nextInt();
	        System.out.print("Enter Pack Size: ");
	        pack_size = in.nextInt();
	        System.out.print("Enter Product Price: ");
	        product_price = in.nextInt();
	    }
	    
	    public void discount() {
	        product_price -= 10;
	    }
	    
	    public void display() {
	        System.out.println("Product Code: " + product_code);
	        System.out.println("Flavour: " + flavour);
	        System.out.println("Pack Type: " + pack_type);
	        System.out.println("Pack Size: " + pack_size);
	        System.out.println("Product Price: " + product_price);
	    }
	    
	    public static void main(String args[]) {
	        FruitJuice obj = new FruitJuice();
	        obj.input();
	        obj.discount();
	        obj.display();
	    }
}
