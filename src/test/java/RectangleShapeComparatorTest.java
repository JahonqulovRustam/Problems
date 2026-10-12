import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleShapeComparatorTest {
	private static final RectangleShapeComparator rectangleShapeComparator = new RectangleShapeComparator();
	
	@Test
	void testSameRectanglesAfter180GradusRotation() {
		int[][] m = {
				{1, 0, 0, 1},
				{0, 1, 1, 0},
				{1, 1, 1, 1},
				{1, 0, 0 ,1}
		};
		
		int[][] n = {
				{1, 0, 0, 1},
				{1, 1, 1, 1},
				{0, 1, 1, 0},
				{1, 0, 0, 1},
		};
		
		assertTrue(rectangleShapeComparator.equals(m, n));
	}
	
	@Test
	void testNotSameRectangles() {
		int[][] m = {
				{1, 0, 1},
				{0, 0, 1},
		};
		
		int[][] n = {
				{0, 1, 1},
				{1, 0, 0}
		};
		
		assertFalse(rectangleShapeComparator.equals(m, n));
	}
}
