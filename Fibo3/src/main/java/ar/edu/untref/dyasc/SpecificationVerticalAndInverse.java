package ar.edu.untref.dyasc;

public class SpecificationVerticalAndInverse implements TypeOfSpecification{

	@Override
	public String generateSuccession(SuccessionGeneration successionGeneration) {
		int successionLength = successionGeneration.getArraySuccession().length;
		int[] arraySuccession = successionGeneration.getArraySuccession();
		String resultSuccession = ": \n";
		
	    for (int i = successionLength-1; i >= 0; i--){
	        resultSuccession += arraySuccession[i]+"\n";
	    } 
	    return resultSuccession;
	}

}
