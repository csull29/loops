
/*
AllNumbers.java
@ author C Sullivan
28 Feb 2017
*/

public class AllNumbers{
	public static void main(String args[]){

		//variables

		int sum;
		sum=0;

		//Display numbers from 0 to 10 inclusive
		//for loop contains a variable to hold the counter
		//1.starts with initiation
		//2.where does it end
		//3.what is the progression
		//4.what is the print out message
		for(int i=0;i<=10;i=i+1){
			System.out.println(i);
	}

	//starts the counter at zero, does it match the 10? - If no, then print out the message and increase the counter

	//Exercise 2 - Display numbers from 10 to 0 inclusive

		for(int j=10;j>=0; j=j-1){
			System.out.println(j);
		}

	//while loop that displays the following number: 10, 20, 30, 40, 50

		int k=10; //start
		while(k<=50){ //ends
			System.out.println(k); //print out
			k=k+10; //progression

		}

		//for loop that calculates the sum of numbers between 1 and 10
		for(int m=0;m<=10;m=m+1){
			sum=sum+m; // gets the counter and ass each time and stores it in sum
		}
		System.out.println(sum);

}
}


