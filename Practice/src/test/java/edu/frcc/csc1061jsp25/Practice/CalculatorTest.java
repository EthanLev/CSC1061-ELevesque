package edu.frcc.csc1061jsp25.Practice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest {

	Calculator calc;
	
	@BeforeEach
	void setUp() {
		calc = new Calculator();
	}
	
	@Test
	@Disabled("Multiplication functionality not available yet")
	@DisplayName("Multiplication Test")
	void testMultiply() {
		assertEquals(20, calc.multiply(4, 5), "Multiply does not work");
		assertTrue(calc.multiply(4, 5) == 20, "Answer of 4 * 5 is not 20");
	}
	
	@Test
	@Disabled("Division functionality not available yet")
	@DisplayName("Division Test")
	void testDivision() {
		assertEquals(4, calc.divide(2, 8), "Division does not work");
	}
	
	@Test
	@Disabled("Add functionality not available yet")
	@DisplayName("Addition Test")
	void testAdd() {
		assertEquals(10, calc.add(5, 5), "Add does not work");
	}
	
	@Test
	@Disabled("Subtract functionality not available yet")
	@DisplayName("Subtraction Test")
	void testSubtract() {
		assertEquals(10, calc.subtract(15, 5), "Subtract does not work");
	}
}
