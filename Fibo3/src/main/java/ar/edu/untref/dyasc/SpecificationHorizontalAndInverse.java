package ar.edu.untref.dyasc;

public class SpecificationHorizontalAndInverse implements TypeOfSpecification{

	@Override
	public String generateSuccession(SuccessionGeneration successionGeneration) {
		int successionLength = successionGeneration.getArraySuccession().length;
		int[] arraySuccession = successionGeneration.getArraySuccession();
		String resultSuccession = "";
		
        for (int i = successionLength-1; i >= 0; i--){
            resultSuccession += arraySuccession[i]+" ";
        }
        return resultSuccession;
	}

}
