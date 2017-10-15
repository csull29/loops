/*
 *@author J.Power
 *12th Nov 2013
 *OutputUsingDoWhileLoop.java
 */
 public class OutputUsingDoWhileLoop{
     public static void main(String args[]){
		// do while loop
        int i=50;
        do{
			//Outputing all numbers between 50 and 0 counting down in 5's
			System.out.println(i);
			i=i-5;
		}while (i>=0);
	}
 }