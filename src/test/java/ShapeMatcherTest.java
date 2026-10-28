import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeMatcherTest {
	@Test
	void shapeFitsAfter90DegreeRotation() {
		int[][] shape1 = {
				{0, 0, 0, 0},
				{0, 1, 1, 0},
				{0, 1, 0, 0},
				{0, 0, 0, 0}
		};
		
		int[][] shape2 = {
				{0, 0, 0, 0, 0},
				{0, 0, 1, 1, 0},
				{0, 0, 0, 1, 0},
				{0, 0, 0, 0, 0}
		};
		
		assertTrue(ShapeMatcher.isShapeInside(shape1,shape2));
	}
	
	@Test
	void shapeDoesNotFitWhenLargerThanContainer() {
		int[][] shape1 = {
				{0, 0, 0, 0},
				{1, 1, 1, 0},
				{1, 1, 1, 0},
				{0, 0, 0, 0}
		};
		
		int[][] shape2 = {
				{0, 0, 0, 0, 0},
				{0, 0, 0, 1, 0},
				{0, 0, 0, 1, 0},
				{0, 0, 0, 0, 0}
		};
		
		assertFalse(ShapeMatcher.isShapeInside(shape1,shape2));
	}
	
	@Test
	void horizontalLineFitsVerticalLineAfterRotation() {
		int[][] shape1 = {
				{1, 1, 1}
		};
		
		int[][] shape2 = {
				{1},
				{1},
				{1}
		};
		
		assertTrue(ShapeMatcher.isShapeInside(shape1, shape2));
	}
	
	@Test
	void mirroredShapeDoesNotFitBecauseOnlyRotationIsAllowed() {
		int[][] shape1 = {
				{0, 1, 1},
				{1, 1, 0}
		};
		
		int[][] shape2 = {
				{1, 1, 0},
				{0, 1, 1}
		};
		
		assertFalse(ShapeMatcher.isShapeInside(shape1, shape2));
	}
	
	@Test
	void shape1FitsAfter270DegreeRotation() {
		int[][] shape1 = {
				{1, 1, 1},
				{0, 1, 0}
		};
		
		int[][] shape2 = {
				{0, 0, 0, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 1, 1, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0}
		};
		
		assertTrue(ShapeMatcher.isShapeInside(shape1, shape2));
	}
}
