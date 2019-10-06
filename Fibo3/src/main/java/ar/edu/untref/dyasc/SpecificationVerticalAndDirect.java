package ar.edu.untref.dyasc;

public class SpecificationVerticalAndDirect implements TypeOfSpecification{

	@Override
	public String generateSuccession(SuccessionGeneration formatSuccession) {
		FibonacciSuccession fibonacci = new FibonacciSuccession();
		String resultSuccession = "";
		int fibonacciSuccession[] = fibonacci.calculateFibonacciSuccession(formatSuccession.getSuccessionLength());
		resultSuccession = "fibo<"+formatSuccession.getSuccessionLength()+">: \n";
		
	    for (int i = 0; i < formatSuccession.getSuccessionLength(); i++){
	    	resultSuccession += fibonacciSuccession[i]+"\n";
	    }
	    return resultSuccession;
	}

}
