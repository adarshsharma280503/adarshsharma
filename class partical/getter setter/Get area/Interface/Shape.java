package Interface;

interface Shape {
	
	 void getArea(int length, int breath, int height);

}

class Drectrangle implements Shape{
	
	public void getArea(int length, int breath, int height)
	{
		System.out.println("the area of 3D rectrangle is  "+(length*breath*height));
	}
	
	
	
	
}
