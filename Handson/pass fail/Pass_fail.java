/* if the student score more than 60% is is pass or he/she is fail
name : Adarsh sharma
date : 11/10/2022
*/

package javaprojrct;

import java.util.Scanner;

public class Pass_fail {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the gender M/F : ");
		String d = sc.nextLine();
		
		System.out.println("enter your name : ");
		String b = sc.nextLine();
		
		System.out.println("enter the marks: ");
		double a = sc.nextInt();
		
	        System.out.println("your name is : "+ a);
		System.out.println("gender is : "+ d );
		
		double total_marks = 500;
		double percentage= (a/total_marks*(100));
		if(percentage>=300)
		
		System.out.println("you are passed : "+percentage+"%" );
			
		else
		System.out.println("the student is fail : "+ percentage+"%");
		
	}

}
