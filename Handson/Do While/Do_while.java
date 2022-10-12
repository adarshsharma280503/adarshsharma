package javaprojrct;

import java.util.Scanner;

public class Do_while {
	
	public static void main (String args[])
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int a = sc.nextInt();
				
		sc.close();	
		for(int a1 = a ; a1>=0; --a1)
		{
		 do
		 {
			 
		  System.out.println("the reverse of number"+a1 );
		  break;
		 }
		while(a1>=10);
} 
}
}