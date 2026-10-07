import java.util.Arrays;

public class SquareShapeComparator {
	
	public boolean equals(int[][] m, int[][] n) {
		if (m.length != n.length || m[0].length != n[0].length) return false;
		
		for (int i = 0; i < 4; i++) {
			if (Arrays.deepEquals(m, n)) {
				return true;
			}
			
			m = rotateMatrix(m);
		}
		
		return false;
	}
	
	public int[][] rotateMatrix(int[][] m) {
		int length = m.length;
		int[][] newMatrix = new int[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				newMatrix[length - 1 -j][i] = m[i][j];
			}
		}
		
		return newMatrix;
	}
}