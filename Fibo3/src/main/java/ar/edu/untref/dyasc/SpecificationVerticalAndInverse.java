package ar.edu.untref.dyasc;

public class SpecificationVerticalAndInverse implements TypeOfSpecification{

	@Override
	public String generateSuccession(SuccessionGeneration formatSuccession) {
		FibonacciSuccession fibonacci = new FibonacciSuccession();
		String resultSuccession = "";
		int fibonacciSuccession[] = fibonacci.calculateFibonacciSuccession(formatSuccession.getSuccessionLength());
		resultSuccession = "fibo<"+formatSuccession.getSuccessionLength()+">: \n";
		
	    for (int i = formatSuccession.getSuccessionLength()-1; i >= 0; i--){
	        resultSuccession += fibonacciSuccession[i]+"\n";
	    } 
	    return resultSuccession;
	}

}
