package ar.edu.untref.dyasc;

public class SpecificationVerticalAndDirect implements TypeOfSpecification{

	@Override
	public String generateSuccession(SuccessionGeneration successionGeneration) {
		int successionLength = successionGeneration.getArraySuccession().length;
		int[] arraySuccession = successionGeneration.getArraySuccession();
		String resultSuccession = ": \n";
		
	    for (int i = 0; i < successionLength; i++){
	    	resultSuccession += arraySuccession[i]+"\n";
	    }
	    return resultSuccession;
	}

}
