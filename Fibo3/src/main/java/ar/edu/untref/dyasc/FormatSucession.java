package ar.edu.untref.dyasc;

public class FormatSucession {
	private int[] array;
	private String succession = "";
	private String successionLength = "";
	
	public void sumOfSuccessionElements(String specification, int[] arraySuccession){
		this.successionLength = "fibo<"+arraySuccession.length+">";
		SumOfTheSuccession sumOfSuccession = new SumOfTheSuccession();
		array = sumOfSuccession.sumOfSuccessionElements(specification,arraySuccession);
		
		if(array.length == 1){
			this.succession += "s";
		}
	}
	
	public void generateSuccessionWithSpecifications(String specification) {
		SuccessionGeneration succession = new SuccessionGeneration(array);
		
		if(specification.equals("hd") || specification.equals("")){
			this.succession += succession.generateSuccession(new SpecificationHorizontalAndDirect());   
	    }   
		
	    if(specification.equals("hi")){
	    	this.succession += succession.generateSuccession(new SpecificationHorizontalAndInverse());   
	    }
	    	
	    if(specification.equals("vd")){
	    	this.succession += succession.generateSuccession(new SpecificationVerticalAndDirect());
		}
		
	    if(specification.equals("vi")){		
	    	this.succession += succession.generateSuccession(new SpecificationVerticalAndInverse());
		}
	}
	
    public String writeToFile(String fileName){
    	WriteToFile write = new WriteToFile();
    	
		return this.successionLength + write.writeToFile(fileName, this.succession, this.successionLength);
		
	}
	
}
