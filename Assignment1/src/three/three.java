package three;

public class three {
	public static void main(String args[])
	{
		Triangle a = new Triangle();
		System.out.println(a.shape());
		
		Trapezoid b = new Trapezoid();
		System.out.println(b.shape());
		
		Hexagon c = new Hexagon();
		System.out.println(c.shape());
	}

}
abstract class Shape{
	abstract int shape();
}

class Triangle extends Shape{
	int shape()
	{
		return 3;
	}
}
class Trapezoid extends Shape{
	int shape()
	{
		return 4;
	}
}
class Hexagon extends Shape{
	int shape()
	{
		return 6;
	}
}
