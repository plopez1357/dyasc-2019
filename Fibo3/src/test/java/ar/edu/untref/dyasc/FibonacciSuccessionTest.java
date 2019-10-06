package ar.edu.untref.dyasc;

import static org.junit.Assert.*;

public class FibonacciSuccessionTest {
	
	@org.junit.Test
	public void calculateSuccessionWithLength5() {
		FibonacciSuccession fibonacciSuccession = new FibonacciSuccession();
		int[] resultSuccession = fibonacciSuccession.calculateFibonacciSuccession(5);
				
		int[] succession = new int[5];
		succession[0] = 0;
		succession[1] = 1;
		succession[2] = 1;
		succession[3] = 2;
		succession[4] = 3;
		
		for(int i = 0;i<resultSuccession.length;i++) {
			assertEquals(succession[i], resultSuccession[i]);
		}
	}
	
	@org.junit.Test
	public void calculateSuccessionWithLength8() {
		FibonacciSuccession fibonacciSuccession = new FibonacciSuccession();
		int[] resultSuccession = fibonacciSuccession.calculateFibonacciSuccession(8);
				
		int[] succession = new int[8];
		succession[0] = 0;
		succession[1] = 1;
		succession[2] = 1;
		succession[3] = 2;
		succession[4] = 3;
		succession[5] = 5;
		succession[6] = 8;
		succession[7] = 13;
		
		for(int i = 0;i<resultSuccession.length;i++) {
			assertEquals(succession[i], resultSuccession[i]);
		}
	}
	
}
