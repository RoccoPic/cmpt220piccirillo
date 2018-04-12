
public class Square extends GeometricObject implements Colorable {
	private double side;

	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}
	public Square() {
		side = 0;
	}
	Square(double side, String color, boolean filled) {
		super(color, filled);
		setSide(side);
	}
	
	Square(double side)
	{
		this.side = side;
	}
	
	public double getArea() {
		return Math.pow(side, 2);
	}

	
	public double getPerimeter() {
		return side * 4;
	}

	@Override
	public void howToColor() {
		System.out.print("Color all four sides");
	}

	@Override
	public String toString() {
		return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
			+ "\nPerimeter: " + getPerimeter();
	}
}
