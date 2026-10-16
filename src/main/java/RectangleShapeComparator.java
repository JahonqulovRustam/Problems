import java.util.Arrays;

public class RectangleShapeComparator {
	
	public boolean equals(int[][] m, int[][] n) {
		
		for (int i = 0; i < 4; i++) {
			if (Arrays.deepEquals(m, n)) {
				return true;
			}
			
			m = rotateMatrix(m);
		}
		
		return false;
	}
	
	private int[][] rotateMatrix(int[][] m) {
		int rows = m.length;
		int cols = m[0].length;
		int[][] rotatedMatrix = new int[cols][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				rotatedMatrix[j][rows - i - 1] = m[i][j];
			}
		}
		
		return rotatedMatrix;
	}
}
