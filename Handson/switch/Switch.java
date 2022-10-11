package javaprojrct;

import java.util.Scanner;

public class Switch {
	

public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter M, TU, W, TH, F, S ");
	    System.out.println("ENTER SELECTED DAY : ");
		String b = sc.nextLine();
		 
		sc.close();
		
		switch(b.toUpperCase())
		{
		case "M":
		System.out.println("The Day Is Monday ");
		break;
		
		case "TU":
		System.out.println("The Day Is Tuesday ");
		break;
		
		case "W":
		System.out.println("The Day Is Wednesday ");
		break;
		
		case "TH":
		System.out.println("The Day Is Thursday ");
		break;
		
		case "F":
		System.out.println("The Day Is Friday ");
		break;
		
		case "S":
		System.out.println("The Day Is Saturday ");
		break;
		

		}
}
}
