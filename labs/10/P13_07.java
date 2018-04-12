
public class P13_07 {
	public static void main(String[] args) {
		GeometricObject[] squareTest = {new Square(5.0), new Square(10.1), new Square(6.2), new Square(1.5), new Square(9.1)};
		
		for(int i = 0; i < squareTest.length; i++) {
			System.out.println("\nSquare #" + (i + 1));
			System.out.println("Area: " + ((Square)squareTest[i]).getArea());
			((Square)squareTest[i]).howToColor();
		}
		
	}
}
