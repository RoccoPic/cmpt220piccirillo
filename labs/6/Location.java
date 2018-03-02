
public class Location {
	public int row;
	public int column;
	public double maxValue;
	
	Location(double[][] matrix) {
		maxValue = matrix[0][0];
		row = 0;
		column = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > maxValue) {
					maxValue = matrix[i][j];
					row = i;
					column = j;
				}
			}
		}
	}
}
