/*
Topic = marks of student to know there grade 
Name = Adarsh sharma
Date = 13/10/2022
*/
package javaprojrct;

import java.util.Scanner;

public class Percentage {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks 1 to 100 : ");
		double a = sc.nextInt();
		sc.close();
		 
	
		 {	
		   if(a>=90)
		   {
	        System.out.println("grade is A : "+a );
	       }
	       else if(a>=84)
		   {
			 System.out.println(" grade is A1 : "+a);
		   }
		   else if(a>=74)
		   {
			 System.out.println("grade is B : "+a );
		   }
		   else if(a>=64)
		   {
			 System.out.println("grade is C+ : "+a );
		   }
		   else if(a>=42)
		   {
			 System.out.println("grade is C: "+a );
		   }
		   else if(a<=34)
		   {
			 System.out.println("fail : "+a );
		   }
		   
		   }
		   
		}
	}


