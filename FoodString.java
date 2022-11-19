package com.assignments;
//9 Write a program switch case by using expression is string type if the feedback is based on the grade provide the service is good or bad..
public class FoodString {

	public static void main(String[] args) {  
	    
	    System.out.println("Please enter your feedback so we can value it");
	    String feedback="GradeC";
	    String review;
	    switch(feedback){  
	    case "GradeA": review= "Food and service, both were good" ;
	    break;  
	    case "GradeB": review="Food was good, service was average";
	    break;  
	    case "GradeC": review="Food was good, service was bad";
	    break;  
	    case "GradeD": review="Food and service, both were bad";
	    break; 
	    case "GradeE": review="Food was bad, service was average";
	    break; 
	    case "GradeF": review="Food was bad, service was good";
	    break; 
	    default: review=("Feedback not submitted"); ;
	    break;
	    }  
	    System.out.println("Your feedback review is: "+review);

	}  
}
