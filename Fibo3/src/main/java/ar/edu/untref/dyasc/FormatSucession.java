package ar.edu.untref.dyasc;

public class FormatSucession {
	
	public String generateSuccessionWithSpecifications(String specification, int successionLength) {
		SuccessionGeneration succession = new SuccessionGeneration(successionLength);
		
		if(specification.equals("hd") || specification.equals("")){
			return succession.generateSuccession(new SpecificationHorizontalAndDirect());   
	    }   
		
	    if(specification.equals("hi")){
	        return succession.generateSuccession(new SpecificationHorizontalAndInverse());   
	    }
	    	
	    if(specification.equals("vd")){
			return succession.generateSuccession(new SpecificationVerticalAndDirect());
		}
		
	    if(specification.equals("vi")){		
			return succession.generateSuccession(new SpecificationVerticalAndInverse());
		}
	    
		return "Opciones no validas.";
	}
}
