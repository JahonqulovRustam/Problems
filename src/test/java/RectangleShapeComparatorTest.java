import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleShapeComparatorTest {
	
	@Test
	void testSameRectanglesWithoutRotation() {
		int[][] m = {
				{1, 0, 0, 1, 1, 1},
				{1, 0, 0, 0, 1, 0},
				{1, 0, 1, 0, 1, 0},
		};
		
		int[][] n = {
				{1, 0, 0, 1, 1, 1},
				{1, 0, 0, 0, 1, 0},
				{1, 0, 1, 0, 1, 0},
		};
		
		assertTrue(RectangleShapeComparator.equals(m, n));
	}
	
	@Test
	void testSameRectanglesAfter90GradusRotation() {
		int[][] m = {
				{1, 1, 0, 1, 0},
				{1, 1, 0, 0, 0},
				{0, 1, 1, 0, 1}
		};
		
		int[][] n = {
				{0, 1, 1},
				{1, 1, 1},
				{1, 0, 0},
				{0, 0, 1},
				{1, 0, 0}
		};
		
		assertTrue(RectangleShapeComparator.equals(m, n));
	}
	
	@Test
	void testSameRectanglesAfter180GradusRotation() {
		int[][] m = {
				{1, 0, 0, 1},
				{0, 1, 1, 0},
				{1, 0, 0, 1},
				{1, 1, 1, 1},
				{1, 0, 0 ,1}
		};
		
		int[][] n = {
				{1, 0, 0, 1},
				{1, 1, 1, 1},
				{1, 0, 0, 1},
				{0, 1, 1, 0},
				{1, 0, 0, 1},
		};
		
		assertTrue(RectangleShapeComparator.equals(m, n));
	}
	
	@Test
	void testSameRectanglesAfter270GradusRotation() {
		int[][] m = {
				{1, 1, 0, 0, 1, 0},
				{1, 0, 0, 0, 1, 1},
		};
		
		int[][] n = {
				{1, 1, 0, 0, 0, 1},
				{0, 1, 0, 0, 1, 1}
		};
		
		assertTrue(RectangleShapeComparator.equals(m, n));
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
		
		assertFalse(RectangleShapeComparator.equals(m, n));
	}
	
	@Test
	void testSquaresAreEqualAfter270DegreeRotation() {
		int[][] m1 = {
				{1, 1},
				{1, 0}
		};
		int[][] m2 = {
				{1, 1},
				{0, 1}
		};
		
		assertTrue(RectangleShapeComparator.equals(m1, m2));
	}
	
	@Test
	void testSquaresAreEqualAfter180DegreeRotation() {
		int[][] m1 = {
				{1, 0, 0},
				{1, 1, 0},
				{0, 1, 1}
		};
		
		int[][] m2 = {
				{1, 1, 0},
				{0, 1, 1},
				{0, 0, 1}
		};
		
		assertTrue(RectangleShapeComparator.equals(m1, m2));
	}
	
	@Test
	void testSameSquares() {
		int [][] m1 = {
				{1, 1, 0, 1, 0},
				{0, 0, 1, 1, 0},
				{1, 1, 1, 1, 1},
				{0, 1, 0, 1, 1},
				{0, 0, 0, 0, 1}
		};
		
		int [][] m2 = {
				{1, 1, 0, 1, 0},
				{0, 0, 1, 1, 0},
				{1, 1, 1, 1, 1},
				{0, 1, 0, 1, 1},
				{0, 0, 0, 0, 1}
		};
		
		assertTrue(RectangleShapeComparator.equals(m1,m2));
	}
	
	@Test
	void testSameSquaresWithAllZeros() {
		int[][] m1 = {
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0}
		};
		
		int[][] m2 = {
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0}
		};
		
		assertTrue(RectangleShapeComparator.equals(m1,m2));
	}
	
	@Test
	void testEqualsSolidSquares() {
		int[][] m1 = {
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
		};
		int[][] m2 = {
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
		};
		
		assertTrue(RectangleShapeComparator.equals(m1, m2));
	}
	
	@Test
	void testEqualsHollowSquares() {
		int[][] m1 = {
				{1, 1, 1},
				{1, 0, 1},
				{1, 1, 1}
		};
		int[][] m2 = {
				{1, 1, 1},
				{1, 0, 1},
				{1, 1, 1}
		};
		
		assertTrue(RectangleShapeComparator.equals(m1, m2));
	}
	@Test
	void testNotEqual() {
		int[][] solid = {
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
		};
		int[][] hollow = {
				{1, 1, 1},
				{1, 0, 1},
				{1, 1, 1}
		};
		
		assertFalse(RectangleShapeComparator.equals(solid, hollow));
	}
}
