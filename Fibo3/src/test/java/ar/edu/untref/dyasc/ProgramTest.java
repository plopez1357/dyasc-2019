package ar.edu.untref.dyasc;

import static org.junit.Assert.*;

public class ProgramTest{
	
	@org.junit.Test
	public void showSuccessionVerticalAndDirect(){
		Program program = new Program();
		String succession[] = new String[2];
		succession[0] ="-o=vd";
		succession[1] ="5";
		String resultSuccession = program.showSucession(succession);
		assertEquals("fibo<5>: \n0\n1\n1\n2\n3\n", resultSuccession);
	}
	
	@org.junit.Test
	public void showSuccessionVerticalAndInverse() {
		Program program = new Program();
		String succession[] = new String[2];
		succession[0] ="-o=vi";
		succession[1] ="8";
		String resultSuccession = program.showSucession(succession);
		assertEquals("fibo<8>: \n13\n8\n5\n3\n2\n1\n1\n0\n", resultSuccession);
	}
	
	@org.junit.Test
	public void showSuccessionHorizontalAndDirect() {
		Program program = new Program();
		String succession[] = new String[2];
		succession[0] ="-o=hd";
		succession[1] ="6";
		String resultSuccession = program.showSucession(succession);
		assertEquals("fibo<6>: 0 1 1 2 3 5 ", resultSuccession);
	}
	
	@org.junit.Test
	public void showSuccessionHorizontalAndInverse() {
		Program program = new Program();
		String succession[] = new String[2];
		succession[0] ="-o=hi";
		succession[1] ="9";
		String resultSuccession = program.showSucession(succession);
		assertEquals("fibo<9>: 21 13 8 5 3 2 1 1 0 ", resultSuccession);
	}
	
	@org.junit.Test
	public void showSuccessionWithoutSpecification() {
		Program program = new Program();
		String succession[] = new String[1];
		succession[0] ="7";
		String resultSuccession = program.showSucession(succession);
		assertEquals("fibo<7>: 0 1 1 2 3 5 8 ", resultSuccession);
	}
	
	@org.junit.Test
	public void validateOutputSumElements() {
		Program program = new Program();
		String succession[] = new String[3];
		succession[0] ="-o=hi";
		succession[1] ="-m=s";
		succession[2] ="5";
		String resultSuccession = program.showSucession(succession);
		assertEquals("fibo<5>s: 7 ", resultSuccession);
	}
	
	@org.junit.Test
	public void validateOutputToFile() {
		Program program = new Program();
		String succession[] = new String[3];
		succession[0] ="-o=vd";
		succession[1] ="-f=salida.txt";
		succession[2] ="5";
		String resultSuccession = program.showSucession(succession);
		assertEquals("fibo<5> guardado en salida.txt", resultSuccession);
	}
	
	@org.junit.Test
	public void validateOutputToFileWithSum() {
		Program program = new Program();
		String succession[] = new String[4];
		succession[0] ="-o=vd";
		succession[1] ="-f=salida.txt";
		succession[2] ="-m=s";
		succession[3] ="5";
		String resultSuccession = program.showSucession(succession);
		assertEquals("fibo<5> guardado en salida.txt", resultSuccession);
	}
	
	@org.junit.Test
	public void validateOutputToFileWithList() {
		Program program = new Program();
		String succession[] = new String[4];
		succession[0] ="-o=hi";
		succession[1] ="-f=salida.txt";
		succession[2] ="-m=l";
		succession[3] ="5";
		String resultSuccession = program.showSucession(succession);
		assertEquals("fibo<5> guardado en salida.txt", resultSuccession);
	}
	
	@org.junit.Test
	public void validateErrorMoreFourValues() {
		Program program = new Program();
		String succession[] = new String[5];
		succession[0] ="-o=hi";
		succession[1] ="-f=salida.txt";
		succession[2] ="-m=s";
		succession[3] ="5";
		succession[4] ="7";
		String resultSuccession = program.showSucession(succession);
		assertEquals("Opciones no validas.", resultSuccession);
	}
	
	@org.junit.Test
	public void validateErrorWithoutEnteringValues() {
		Program program = new Program();
		String succession[] = new String[0];
		String resultSuccession = program.showSucession(succession);
		assertEquals("Opciones no validas.", resultSuccession);
	}
	
	@org.junit.Test
	public void validateErrorInvalidSpecifications() {
		Program program = new Program();
		String succession[] = new String[2];
		succession[0] ="-o=xy";
		succession[1] ="2";
		String resultSuccession = program.showSucession(succession);
		assertEquals("Opciones no validas.", resultSuccession);
	}
	
}
