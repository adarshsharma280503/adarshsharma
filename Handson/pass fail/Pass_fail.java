package javaprojrct;

import java.util.Scanner;

public class Pass_fail {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks: ");
		double a = sc.nextInt();
		
		double total_marks = 500;
		double percentage= (a/total_marks*(100));
		if(percentage<300)
		
		System.out.println("you are passed : "+percentage+"%" );
			
		else
		System.out.println("the student is fail : "+ percentage+"%");
		
	}

}
