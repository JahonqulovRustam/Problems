import java.util.Arrays;

public class ShapeMatcher {
	
	public static boolean isShapeInside(int[][] m, int[][] n) {
		int[][] shape1 = crop(m);
		int[][] shape2 = crop(n);
		
		if (shape1.length == 0 || shape2.length == 0) {
			return false;
		}
		
		for (int rot = 0; rot < 4; rot++) {
			for (int r = 0; r <= shape2.length - shape1.length; r++) {
				for (int c = 0; c <= shape2[0].length - shape1[0].length; c++) {
					int[][] sub = extractSubMatrix(shape2, r, c, shape1.length, shape1[0].length);
					if (Arrays.deepEquals(shape1, sub)) {
						return true;
					}
				}
			}
			
			shape1 = RectangleShapeComparator.rotateMatrix(shape1);
		}
		return false;
	}
	
	private static int[][] extractSubMatrix(int[][] matrix, int startR, int startC, int rows, int cols) {
		int[][] subMatrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				subMatrix[i][j] = matrix[startR + i][startC + j];
			}
		}
		return subMatrix;
	}
	
	private static int[][] crop(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		int top = 0;
		while (top < rows && isRowAllZeros(matrix, top)) {
			top++;
		}
		
		if (top == rows) {
			return new int[0][0];
		}
		
		int bottom = rows - 1;
		while (bottom >= 0 && isRowAllZeros(matrix, bottom)) {
			bottom--;
		}
		
		int left = 0;
		while (left < cols && isColAllZeros(matrix, left)) {
			left++;
		}
		
		int right = cols - 1;
		while (right >= 0 && isColAllZeros(matrix, right)) {
			right--;
		}
		
		int croppedRows = bottom - top + 1;
		int croppedCols = right - left + 1;
		int[][] cropped = new int[croppedRows][croppedCols];
		
		for (int r = 0; r < croppedRows; r++) {
			for (int c = 0; c < croppedCols; c++) {
				cropped[r][c] = matrix[top + r][left + c];
			}
		}
		
		return cropped;
	}
	
	private static boolean isRowAllZeros(int[][] matrix, int row) {
		for (int c = 0; c < matrix[row].length; c++) {
			if (matrix[row][c] != 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isColAllZeros(int[][] matrix, int col) {
		for (int r = 0; r < matrix.length; r++) {
			if (matrix[r][col] != 0) {
				return false;
			}
		}
		return true;
	}
}