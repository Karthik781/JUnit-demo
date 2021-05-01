package junit.example;


public class ArthematicOpsDemo {
	
	//@Test
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int a=7;
		int b=8;
		int expected = 15;
		int actual = obj.addittion(a, b);
		System.out.println(actual);
		
		//Assertions.assertEquals(expected, actual);

	}

}
