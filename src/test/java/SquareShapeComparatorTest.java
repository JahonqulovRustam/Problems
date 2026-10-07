import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SquareShapeComparatorTest {
	
	private SquareShapeComparator comparator;
	
	@BeforeEach
	void setUp() {
		comparator = new SquareShapeComparator();
	}
	
	@Test
	void testSolid2x2() {
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
	void testSolid3x3() {
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
	void testHollow3x3() {
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
	void testHollow4x4() {
		int[][] m1 = {
				{1, 1, 1, 1},
				{1, 1, 0, 1},
				{1, 0, 0, 1},
				{1, 1, 1, 1}
		};
		int[][] m2 = {
				{1, 1, 1, 1},
				{1, 0, 0, 1},
				{1, 0, 0, 1},
				{1, 1, 1, 1}
		};

		assertFalse(comparator.equals(m1, m2));
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