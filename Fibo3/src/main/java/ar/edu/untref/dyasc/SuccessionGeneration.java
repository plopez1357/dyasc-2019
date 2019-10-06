package ar.edu.untref.dyasc;

public class SuccessionGeneration {
	private int successionLength;
	
	public SuccessionGeneration(int successionLength) {
		super();
		this.successionLength = successionLength;
	}
	
	public String generateSuccession(TypeOfSpecification typeOfSpecification) {
		return typeOfSpecification.generateSuccession(this);
	}

	public int getSuccessionLength() {
		return successionLength;
	}

	public void setSuccessionLength(int successionLength) {
		this.successionLength = successionLength;
	}
}
