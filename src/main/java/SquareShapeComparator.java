import java.util.Arrays;

public class SquareShapeComparator {
	
	public boolean isValidSquare(int[][] m, int n) {
		if (n < 2 || m.length != n) return false;
		
		int innerValue = (n >= 3) ? m[1][1] : 1;
		
		if (innerValue != 0 && innerValue != 1) return false;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean isBorder = (i == 0 || i == n - 1 || j == 0 || j == n - 1);
				int expected = isBorder ? 1 : innerValue;
				
				if (m[i][j] != expected) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean areEqual(int[][] m1, int[][] m2, int n) {
		if (!isValidSquare(m1, n) || !isValidSquare(m2, n)) {
			return false;
		}
		
		return Arrays.deepEquals(m1, m2);
	}
}