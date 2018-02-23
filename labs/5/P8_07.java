public class P8_07 {
	/** Main method */
	public static void main(String[] args) {

		// using an array initializer to store my arrays in the multidimensional array
		double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},{5.5, 4, -0.5}};

		// p1 and p2 are the indices in the points' array
		int point1 = 0, point2 = 1; // Initial two points
		double shortestDistance = distance(points[point1][0], points[point1][1], points[point1][2],
			points[point2][0], points[point2][1], points[point2][2]); // Initialize shortest Distance

		// Compute distance for every two points
		for (int a = 0; a < points.length; a++) {
			for (int b = a + 1; b < points.length; b++) {
				double distance = distance(points[a][0], points[a][1], points[a][2],
					points[b][0], points[b][1], points[b][2]); // Find distance

				if (shortestDistance > distance) {
					point1 = a; 
					point2 = b; 
					shortestDistance = distance; // Update shortestDistance
				}
		}
				}
		System.out.println("The closest two points are " + "(" + points[point1][0] + ", " + points[point1][1] + ", " + points[point1][2] + ") and (" + points[point2][0] + 
				", " + points[point2][1] + ", " + points[point2][2] + ")");
	}
	public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
	}
}