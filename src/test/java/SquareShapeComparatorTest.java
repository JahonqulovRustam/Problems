import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareShapeComparatorTest {
	
	private static final SquareShapeComparator comparator = new SquareShapeComparator();
	@Test
	void testEqualsDifferentSquares() {
		int[][] m1 = {
				{1, 1},
				{1, 0}
		};
		int[][] m2 = {
				{1, 1},
				{0, 1}
		};
		
		assertTrue(comparator.equals(m1, m2));
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

		assertTrue(comparator.equals(m1, m2));
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

		assertTrue(comparator.equals(m1, m2));
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

		assertFalse(comparator.equals(solid, hollow));
	}

	@Test
	void testInvalidSquares() {
		int[][] validSolid = {
				{1, 1},
				{1, 1}
		};
		int[][] invalid = {
				{1, 0},
				{0, 0}
		};

		assertFalse(comparator.equals(validSolid, invalid));
	}
}