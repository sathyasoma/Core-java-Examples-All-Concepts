package com.assignments;

//write a java program to create a binary triangle
public class BinaryTEx
{
    public static void main(String[] args)
    { 
         int  c =1;
         for(int i=0;  i<5;  i++) //main for loop
         {
                for(int j=0;  j<=i;  j++)  //inner for loop
                {
                     System.out.print(c+" ");
                     c = 1 - c ;
                } 
                c = i % 2 ;
                System.out.println();
         }
    } 
}
  