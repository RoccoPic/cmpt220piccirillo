import java.util.Scanner;
public class Rectangle {

		double width;
		double height;
		Rectangle() {
			width = 1;
			height = 1;
		}
		Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
			}
		
		public double getArea() {
			return (this.width * this.height);
			}
		public double getPerimeter() {
			return (2 * (this.width + this.height));
		}
	}


