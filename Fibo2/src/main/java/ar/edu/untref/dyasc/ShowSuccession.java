package ar.edu.untref.dyasc;

public class ShowSuccession {
	
	public String showSucession(String data) {
		FibonacciSuccession fibonacci = new FibonacciSuccession();
		String resultSuccession = "";
		int fibonacciSuccession[];
		//Expresion regular con -o
		if(data.matches("-o=[v|h][d|i][\\s][0-9]+")){
			//obtiene el largo de la sucesion
		    int successionLength = Integer.parseInt(data.substring(6, data.length()));
		    //obtiene el valor h o v
		    String orientation = data.substring(3,4);
		    //obtiene el valor d o i
		    String direction = data.substring(4,5);
		    resultSuccession = "fibo<"+successionLength+">:";
		    fibonacciSuccession = fibonacci.calculateFibonacciSuccession(successionLength);
		    if(orientation.equals("h")){
		    	if(direction.equals("d")){
		    		for (int i = 0; i < successionLength; i++){
		    			resultSuccession += fibonacciSuccession[i]+" ";
		    	    }
		    		return resultSuccession;
		        }else{
		        	for (int i = successionLength-1; i >= 0; i--){
		        		resultSuccession += fibonacciSuccession[i]+" ";
		    	    }
		        	return resultSuccession;
		        }
	        }else{
	        	System.out.println();
	        	if(direction.equals("d")){
	        		resultSuccession += "\n";
		    		for (int i = 0; i < successionLength; i++){
		    			resultSuccession += fibonacciSuccession[i]+"\n";
		    	    }
		    		return resultSuccession;
		        }else{
		        	resultSuccession += "\n";
		        	for (int i = successionLength-1; i >= 0; i--){
		        		resultSuccession += fibonacciSuccession[i]+"\n";
		    	    }
		        	return resultSuccession;
		        }	
	        }
		//expresion sin -o
	    }else if(data.matches("[0-9]+")){
	    	int successionLength = Integer.parseInt(data);
	    	fibonacciSuccession = fibonacci.calculateFibonacciSuccession(successionLength);
	    	resultSuccession = "fibo<"+successionLength+">:";
	    	for(int i = 0; i < successionLength; i++){
	    		resultSuccession += fibonacciSuccession[i]+" ";
		    }
	    	return resultSuccession;
	    }else {
	    	return "Opciones no validas.";
	    }

	}
}
