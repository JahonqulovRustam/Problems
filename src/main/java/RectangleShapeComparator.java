import java.util.Arrays;

public class RectangleShapeComparator {
	
	public boolean equals(int[][] m, int[][] n) {
		
		for (int i = 0; i < 4; i++) {
			if (Arrays.deepEquals(m, n)) {
				return true;
			}
			
			m = SquareShapeComparator.rotateMatrix(m);
		}
		
		return false;
	}
}
