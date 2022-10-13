/*
Topic = patter
Name = Adarsh sharma
Date = 13/10/2022
*/
package javaprojrct;

import java.util.Scanner;

public class Design {
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int a = sc.nextInt();
		sc.close();
	
	 for(int a2= 1;a2<=a;a2++)
	 {
	   System.out.println();
	  for (int a3=1; a3<=a2; a3++)
	 { 
	  System.out.print("*");
	 }
	 }
	 	
	}
}