package ar.edu.untref.dyasc;

public class SpecificationHorizontalAndDirect implements TypeOfSpecification{
	
	@Override
	public String generateSuccession(SuccessionGeneration formatSuccession) {
		FibonacciSuccession fibonacci = new FibonacciSuccession();
		String resultSuccession = "";
		int fibonacciSuccession[] = fibonacci.calculateFibonacciSuccession(formatSuccession.getSuccessionLength());
		resultSuccession = "fibo<"+formatSuccession.getSuccessionLength()+">: ";
		
		for (int i = 0; i < formatSuccession.getSuccessionLength(); i++){
		    resultSuccession += fibonacciSuccession[i]+" ";
	    }
		return resultSuccession;
	}
    

}
