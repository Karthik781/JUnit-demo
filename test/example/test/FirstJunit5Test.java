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
import org.junit.jupiter.api.Test;

import junit.example.Calculator;

/**
 * @author Karthik kedam
 *
 */
class FirstJunit5Test {
	
	@BeforeAll
	static void setup() {
	    System.out.println("Before each");
	}
	
    @BeforeEach
    void setupThis(){
        System.out.println("BeforeEach executed");
    }
    

	@Test
	void testAdd() {
		Calculator obj = new Calculator();
		int actual = obj.addittion(7, 10);
		Assertions.assertEquals(17, actual);
	}
	
	@Test
	void testSub() {
		Calculator obj = new Calculator();
		int actual = obj.subtraction(15, 10);
		Assertions.assertEquals(5, actual);
	}
	
	@Test
	void testMul() {
		Calculator obj = new Calculator();
		int actual = obj.multiplication(15, 10);
		Assertions.assertEquals(150, actual);
	}
	
    @Test
    void testMul2() 
    {
        Calculator obj = new Calculator();
		int actual = obj.multiplication(15, 10);
        String env = "beta";
        Assumptions.assumeTrue(env.equals("aplha") , FirstJunit5Test:: message );
		Assertions.assertEquals(150, actual);
    }
     
    private static String message () {
        return "TEST Assumptions Execution Failed :: ";
    }
	
	@Test
	void testDiv() {
		Calculator obj = new Calculator();
		int actual = obj.division(200, 10);
		Assertions.assertEquals(20, actual);
	}
	

    @AfterEach
    void tearThis(){
        System.out.println("AfterEach executed");
    }
     
    @AfterAll
    static void tear(){
        System.out.println("AfterAll executed");
    }
}
