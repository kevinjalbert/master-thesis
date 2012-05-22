public class TriangleTest {

	@Test
	public void testScalene() {
	  TType type = Triangle.classify(1, 2, 3);
	  assertEquals(SCALENE, type);
	}

	@Test
	public void testIsoceles() {
	  TType type = Triangle.classify(2, 2, 3);
	  assertEquals(ISOSCELES, type);
	}

	@Test
	public void testEquiliteral() {
	  TType type = Triangle.classify(1, 1, 1);
	  assertEquals(EQUILATERAL, type);
	}

	@Test
	public void testNegative() {
	  TType type = Triangle.classify(1, -1, 1);
	  assertEquals(INVALID, type);
	}

	@Test
	public void testInvalid() {
	  TType type = Triangle.classify(6, 1, 2);
	  assertEquals(INVALID, type);
	}
}
