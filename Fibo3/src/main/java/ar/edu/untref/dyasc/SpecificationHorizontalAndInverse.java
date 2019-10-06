package ar.edu.untref.dyasc;

public class SpecificationHorizontalAndInverse implements TypeOfSpecification{

	@Override
	public String generateSuccession(SuccessionGeneration formatSuccession) {
		FibonacciSuccession fibonacci = new FibonacciSuccession();
		String resultSuccession = "";
		int fibonacciSuccession[] = fibonacci.calculateFibonacciSuccession(formatSuccession.getSuccessionLength());
		resultSuccession = "fibo<"+formatSuccession.getSuccessionLength()+">: ";
		
        for (int i = formatSuccession.getSuccessionLength()-1; i >= 0; i--){
            resultSuccession += fibonacciSuccession[i]+" ";
        }
        return resultSuccession;
	}

}
