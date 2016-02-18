import junit.framework.TestCase;


public class MyTester extends TestCase {

	public void testNfactorial() {
		MyCalculator calculator =  new MyCalculator();
		
		float actual1 = calculator.nfactorial (-4);
		System.out.println(actual1);
		assertEquals("Does not work on negative numbers", actual1, 1, 0.0);
		
		float actual2 = calculator.nfactorial (0);
		assertEquals("Works on zero", actual2, 1, 0.0);
		
		float actual3 = calculator.nfactorial (1);
		assertEquals("Works on number one", actual3, 1, 0.0);
		
		float actual4 = calculator.nfactorial (1212);
		assertEquals("Does not work on large numbers", actual4, 0, 0.0);
		System.out.println(actual4);
	}

	public void testBinarySearch() {
		int [] a = {1,5,7,10,14,16,17,25,26,30};
		MyCalculator calculator =new MyCalculator();
		
		float actual1 = calculator.binarySearch(a, 15);
		assertEquals("Return -1 (Not found in the array!)",actual1, -1, 0.0);
		
		float actual2 = calculator.binarySearch(a, 14);
		assertEquals("Return 4",actual2, 4, 0.0);
		
		float actual3 = calculator.binarySearch(a, 25);
		assertEquals("Return 7",actual3, 7 , 0.0);
		
		float actual4 = calculator.binarySearch(a, 5);
		assertEquals("Return 1",actual4, 1, 0.0);
	}

}