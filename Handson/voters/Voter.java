package javaprojrct;

import java.util.Scanner;

public class Voter {
	
	public static void main (String args[]) {
		   
		
		Scanner v = new Scanner(System.in);
		System.out.println("enter the age : ");
		int a = v.nextInt();
		 
		v.close();
		
		if(a<18)
		System.out.println("the person is cant vote because he is less the 18 and her age is : "+ a);
		
		else
		System.out.println("he/she can vote and his/her age is : " + a);
				
	}
	
	

}
