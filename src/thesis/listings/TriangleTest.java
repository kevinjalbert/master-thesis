public class TriangleTest {

	public void testScalene() {
	  TType type = Triangle.classify(1, 2, 3);
	  assertEquals(SCALENE, type);
	}

	public void testIsoceles() {
	  TType type = Triangle.classify(2, 2, 3);
	  assertEquals(ISOSCELES, type);
	}

	public void testEquiliteral() {
	  TType type = Triangle.classify(1, 1, 1);
	  assertEquals(EQUILATERAL, type);
	}

	public void testNegative() {
	  Boolean isValid = Triangle.isValid(1, -1, 1);
	  assertEquals(true, isValid);
	}

	public void testInvalid() {
	  Boolean isValid = Triangle.isValid(6, 1, 2);
	  assertEquals(true, isValid);
	}

	public void testValid() {
	  Boolean isValid = Triangle.isValid(2, 3, 4);
	  assertEquals(false, isValid);
	}
}
