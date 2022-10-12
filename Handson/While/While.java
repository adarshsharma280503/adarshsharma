/*
TOPIC: DO DEMOSTRATE WHILE LOOP CONTINUE UNTIL NUMBER IS POSITIVE BY USING WHILE
NAME: ADARSH SHARMA
DATE : 12/10/2022
*/

package javaprojrct;

import java.util.Scanner;

class While {

	public static void main (String args[])
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int a = sc.nextInt();
				
		sc.close();		
		
		while(a>0)
		{
			System.out.println("the number is a positive number : "+a);
			a++;
			break;
		}
	}
}
