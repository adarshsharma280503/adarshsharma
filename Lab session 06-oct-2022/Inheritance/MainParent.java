/*Ques2:create a class parent with default constructor and void sing method.print something inside 
  the constructor and method Create child class which will inherit the property of parent and has
  methods void speak and void dance.print something inside the two methods.
  Create another class inheritance and object of class and call all the methods.also mention the type
  of inheritance on the top of the program.
*/



package Inheritance;

public class MainParent {

	public static void main(String[] args) {
		{
			Child C = new Child();
			C.sing();
			C.Speak();
			C.Dance();
		}
		

	}

}
