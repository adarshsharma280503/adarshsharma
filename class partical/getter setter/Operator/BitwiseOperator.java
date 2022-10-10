package javaprojrct;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter first number : ");
		int a = sc.nextInt();

		System.out.println(" enter second number : ");
		int b = sc.nextInt();
		
		sc.close();
		//bitwise operator
		System.out.println("a&b AND: " + (a & b));
		//0001
		//0010
		//-------
		//0000
		System.out.println("a|b OR: " + (a | b));
		//0001
		//0010
		//-------
		//0011
		System.out.println("a^b XOR : " + (a ^ b));
		//0001
		//0010
		//-------
		//0011
	}

}
