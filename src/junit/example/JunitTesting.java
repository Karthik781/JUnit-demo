package junit.example;
import junit.example.ArthematicOps;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitTesting {
	
	@BeforeAll
	public static void setUpClass(){	
		System.out.println("Before all");
		
	}
	@BeforeEach
	public void setUp(){
		
	}
	
	@Test
	public void testAdd(){
		ArthematicOps c = new ArthematicOps();
		int sum = c.addittion(7, 8);
		System.out.println("Sum is" + sum);
	}
	
	@Test
	public void testSub(){
		
	}
	
	@Test
	public void testMul(){
		
	}
	
	@Test
	public void testDiv(){
		
	}
	
	@AfterEach
	public void tearDown(){
		
	}
	
	@AfterAll
	public void tearDownClass(){
		
	}

}
