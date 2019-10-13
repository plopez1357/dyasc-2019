package ar.edu.untref.dyasc;

public class SumOfTheSuccession {
	
	public int[] sumOfSuccessionElements(String specification, int[] arraySuccession) {
		if(specification.contentEquals("s")) {
			int result = 0;
			int arrayResult[] = new int[1];
			
		    for (int i = 0;i < arraySuccession.length; i++){
		    	result += arraySuccession[i];
		    }
		    arrayResult[0] = result;
		    return arrayResult;
			
		}else {
			return arraySuccession;
		}
	}

}
