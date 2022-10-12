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
