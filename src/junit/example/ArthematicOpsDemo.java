package junit.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ArthematicOpsDemo {
	
	@Test
	public static void main(String[] args) {
		ArthematicOps obj = new ArthematicOps();
		int a=7;
		int b=8;
		int expected = 15;
		int actual = obj.addittion(a, b);
		
		Assertions.assertEquals(expected, actual);

	}

}
