/**
 * 
 */
package example.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import junit.example.Calculator;

/**
 * @author Karthik kedam
 *
 */
class FirstJunit5Test {

	Calculator c;

	@BeforeAll
	static void setup() {
		System.out.println("Before All");
	}

	@BeforeEach
	void setupThis() {
		c = new Calculator();
	}
	
	@DisplayName("Nested Testing addition")
	@Nested
	class Addition{
		@DisplayName("Positive Testing addition")
		@Test
		void testAddPositive() {
			int actual = c.addittion(7, 10);
			Assertions.assertEquals(17, actual);
		}
		@DisplayName("Negative Testing addition")
		@Test
		void testAddNegative() {
			int actual = c.addittion(-1, -5);
			Assertions.assertEquals(-6, actual);
		}	
		@Test
		void testAddNegative2() {
			int actual = c.addittion(-1, 5);
			Assertions.assertEquals(-6, actual);
		}	
	}

	@DisplayName("Testing subtraction")
	@Test
	void testSub() {
		int actual = c.subtraction(15, 10);
		Assertions.assertEquals(5, actual);
	}

	@DisplayName("Testing multiplication")
	@Test
	void testMul() {
		int actual = c.multiplication(15, 10);
		Assertions.assertEquals(150, actual);
	}

	@DisplayName("Testing parameterized addition")
	@ParameterizedTest(name = "{0} + {1} = {3}")
	@CsvSource({ "0,    1,   1",
				"1,    2,   3",
				"49,  51, 100",
				"1,  100, 101" 
				})

	void add(int first, int second, int expectedResult) {
		Assertions.assertEquals(expectedResult, c.addittion(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}

	@DisplayName("Testing multiplication with Assumptions")
	@Test
	void testMul2() {
		int actual = c.multiplication(15, 10);
		String env = "beta";
		Assumptions.assumeTrue(env.equals("aplha"), FirstJunit5Test::message);
		Assertions.assertEquals(150, actual);
	}

	private static String message() {
		return "TEST Assumptions Execution Failed :: ";
	}

	@Test
	@DisplayName("Testing division")
	void testDiv() {
		int actual = c.division(200, 10);
		Assertions.assertEquals(20, actual);
	}

	@AfterEach
	void tearThis() {
		c = null;
	}

	@AfterAll
	static void tear() {
		System.out.println("AfterAll executed");
	}
}
