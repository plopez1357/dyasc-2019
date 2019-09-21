package ar.edu.untref.dyasc;

import static org.junit.Assert.*;

public class Test{

	/*@org.junit.Test
	public void verifyTheMethod() {
		FibonacciSuccession FibonacciSuccession = new FibonacciSuccession();
		int result = FibonacciSuccession.calculateFibonacciSuccession(7);
		assertEquals(13, result);
	}*/
	
	@org.junit.Test
	public void showSuccessionVerticalAndDirect() {
		ShowSuccession succession = new ShowSuccession();
		String resultSuccession = succession.showSucession("-o=vd 5");
		assertEquals("fibo<5>:\n0\n1\n1\n2\n3\n", resultSuccession);
	}
	
	@org.junit.Test
	public void showSuccessionVerticalAndInverse() {
		ShowSuccession succession = new ShowSuccession();
		String resultSuccession = succession.showSucession("-o=vi 8");
		assertEquals("fibo<8>:\n13\n8\n5\n3\n2\n1\n1\n0\n", resultSuccession);
	}
	
	@org.junit.Test
	public void showSuccessionHorizontalAndDirect() {
		ShowSuccession succession = new ShowSuccession();
		String resultSuccession = succession.showSucession("-o=hd 5");
		assertEquals("fibo<5>:0 1 1 2 3 ", resultSuccession);
	}
	
	@org.junit.Test
	public void showSuccessionHorizontalAndInverse() {
		ShowSuccession succession = new ShowSuccession();
		String resultSuccession = succession.showSucession("-o=hi 8");
		assertEquals("fibo<8>:13 8 5 3 2 1 1 0 ", resultSuccession);
	}
	
	@org.junit.Test
	public void showSuccessionInvalidOption() {
		ShowSuccession succession = new ShowSuccession();
		String resultSuccession = succession.showSucession("-o=xy 8");
		assertEquals("Opciones no validas.", resultSuccession);
	}
	
	@org.junit.Test
	public void showSuccessionWithoutOHorizontalAndDirect() {
		ShowSuccession succession = new ShowSuccession();
		String resultSuccession = succession.showSucession("9");
		assertEquals("fibo<9>:0 1 1 2 3 5 8 13 21 ", resultSuccession);
	}
}
