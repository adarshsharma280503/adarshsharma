package largenumber;

import java.util.Scanner;

public class Lnumber {

	void number()
	{
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 number : ");
		
		int i = sc.nextInt();
		
		System.out.print("Enter 2 number : ");	
			
		int j = sc.nextInt();
		sc.close();
	
		 if(i>j)
		{
			System.out.println(i + " is greater than " + j);
		}
		
		else
		{
			System.out.println(j + " is greater than " + i);
		}
	}
}
