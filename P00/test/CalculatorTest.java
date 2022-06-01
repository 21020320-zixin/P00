import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private int a, b, c;
	Calculator cal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
		a = 4321;
		b = 1234;
		c = 0;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int actual = cal.add(a,  b);
		
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubstract() {
		int actual = cal.substract(a,  b);
		
		int expected = 3087;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiply() {
		int actual = cal.multiply(a,  b);
		
		int expected = 5332114;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideWithoutZero() {
		int actual = cal.divide(a,  b);
		
		int expected = 3;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideWithZero() {
		try {
			cal.divide(a, c);
			fail("Expected an IllegalArugmentException to be thrown");
		}
		catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not supported", e.getMessage());
		}
		catch(Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}
	

}
