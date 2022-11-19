package com.assignments;
//write a program switch case of class FoodService, 
//expression is feedback based on the feedback 1 to 6 provide the how the service is.
public class FoodService {

	public static void main(String[] args) {  
	    
	    int feedback=2;            //Declaring a variable for switch expression                               
	    switch(feedback){          //Switch expression  
	 
	    //Case statements
	    case 1: System.out.println("Food and service, both were good");                 
	    break;  
	    case 2: System.out.println("Food was good, service was average");  
	    break;  
	    case 3: System.out.println("Food was good, service was bad");  
	    break;  
	    case 4: System.out.println("Food and service, both were bad");  
	    break;  
	    case 5: System.out.println("Food was bad, service was average");  
	    break;
	    case 6: System.out.println("Food was bad, service was good ");
	    break;
	    //Default case statement    
	    default:System.out.println("Feedback not submitted");                         
	    }  
	}  
}
