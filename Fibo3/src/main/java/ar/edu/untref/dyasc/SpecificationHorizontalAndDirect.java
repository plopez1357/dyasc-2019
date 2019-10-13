package ar.edu.untref.dyasc;

public class SpecificationHorizontalAndDirect implements TypeOfSpecification{
	
	@Override
	public String generateSuccession(SuccessionGeneration successionGeneration) {
		int successionLength = successionGeneration.getArraySuccession().length;
		int[] arraySuccession = successionGeneration.getArraySuccession();
		String resultSuccession = ": ";
		
		for (int i = 0; i < successionLength; i++){
		    resultSuccession += arraySuccession[i]+" ";
	    }
		return resultSuccession;
	}
    

}
