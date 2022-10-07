/*we have to create an interface contain an abstract method getArea ()
 here is a 3d rectrangle class implement polygon and provide the implementtation of Rectrangle
 name = adarsh sharma
 date = 7/10/2022
 

*/

package Interface;

import java.util.Scanner;

public class MainShape {
 
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("length of rectrangle : ");
		int l = sc.nextInt();
		
		System.out.println("breath of rectrangle : ");
		int b = sc.nextInt();
		
		System.out.println("height of rectrangle : ");
		int h = sc.nextInt();
		sc.close();
		
		Drectrangle r =new Drectrangle();
		r.getArea(l, b, h);
	}
}
