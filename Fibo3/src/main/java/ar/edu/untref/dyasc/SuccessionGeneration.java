package ar.edu.untref.dyasc;

public class SuccessionGeneration {
	private int[] arraySuccession;
	
	public SuccessionGeneration(int[] arraySuccession) {
		super();
		this.arraySuccession = arraySuccession;
	}
	
	public String generateSuccession(TypeOfSpecification typeOfSpecification) {
		return typeOfSpecification.generateSuccession(this);
	}

	public int[] getArraySuccession(){
		return arraySuccession;
	}
}
