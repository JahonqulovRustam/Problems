import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeMatcherTest {
	@Test
	void test1() {
		int[][] m = {
				{0, 0, 0, 0},
				{0, 1, 1, 0},
				{0, 1, 0, 0},
				{0, 0, 0, 0}
		};
		
		int[][] n = {
				{0, 0, 0, 0, 0},
				{0, 0, 1, 1, 0},
				{0, 0, 0, 1, 0},
				{0, 0, 0, 0, 0}
		};
		
		assertTrue(ShapeMatcher.isShapeInside(m,n));
	}
	
	@Test
	void test2() {
		int[][] m = {
				{0, 0, 0, 0},
				{1, 1, 1, 0},
				{1, 1, 1, 0},
				{0, 0, 0, 0}
		};
		
		int[][] n = {
				{0, 0, 0, 0, 0},
				{0, 0, 0, 1, 0},
				{0, 0, 0, 1, 0},
				{0, 0, 0, 0, 0}
		};
		
		assertFalse(ShapeMatcher.isShapeInside(m,n));
	}
	
	@Test
	void test3() {
		int[][] x = {
				{1, 1, 1}
		};
		
		int[][] y = {
				{1},
				{1},
				{1}
		};
		
		assertTrue(ShapeMatcher.isShapeInside(x, y));
	}
}
