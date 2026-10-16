import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleShapeComparatorTest {
	
	RectangleShapeComparator rectangleShapeComparator = new RectangleShapeComparator();
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
		
		assertTrue(rectangleShapeComparator.equals(m, n));
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
		
		assertTrue(rectangleShapeComparator.equals(m, n));
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
