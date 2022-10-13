/*
Topic = addition of number till the negative number didn't exist 
Name = Adarsh sharma
Date = 13/10/2022
*/
package javaprojrct;

import java.util.Scanner; 

public class Do_whileloop {


	public static void main(String args[])
	{
	
		    int sum = 0;
		    int number = 0;

		    // create an object of Scanner class
		    Scanner sc = new Scanner(System.in);
		    
		    // do...while loop continues 
		    // until entered number is positive
		    do {
		      // add only positive numbers
		      sum += number;
		      System.out.print("Enter a number: ");
		      number = sc.nextInt();
		      
		    } while(number >= 0); 
		    
		    System.out.println("Sum = " + sum);
		    sc.close();
		  }
}
