package ar.edu.untref.dyasc;

public class Program {
	
    public String showSucession(String[] args){
        String result = "";
        if(args.length >= 1 && args.length <= 4) {
        	FibonacciSuccession fibonacci = new FibonacciSuccession();
        	
        	int[] arraySuccession = null;
        	int successionLength = 0;
        	String specificationO = "";
        	String specificationM = "";
        	String specificationF = "";
        	
        	for(int i = 0;i < args.length;i++){
        		
        		if(args[i].matches("[0-9]+")){
        			successionLength = Integer.parseInt(args[i]);
        		}
        		
        		if(args[i].matches("-o=.*")){
        			if(args[i].matches("-o=[v|h][d|i]")){
        				specificationO = args[i].substring(3,5);
        			}else{
        				specificationO = "Opciones no validas.";
        			}
        		}
        		
        		if(args[i].matches("-f=.*")){
        			if(args[i].matches("-f=\\w+.txt")){
        				specificationF = args[i].substring(3,args[i].length());
        			}else {
        				specificationF = "Opciones no validas.";
        			}
        		}
        		
        		if(args[i].matches("-m=.*")){
        			if(args[i].matches("-m=[s|l]")){
        			    specificationM = args[i].substring(3,4);
        			}else{
        				specificationM = "Opciones no validas.";
        			}
        		}
        	}
        	
        	if(successionLength == 0  || specificationO == "Opciones no validas." ||
        			specificationF == "Opciones no validas." || 
        			specificationM == "Opciones no validas.") {
        		result = "Opciones no validas.";
        	}else{
        		
        		arraySuccession = fibonacci.calculateFibonacciSuccession(successionLength);
        	
	            FormatSucession succession = new FormatSucession();
	            succession.sumOfSuccessionElements(specificationM, arraySuccession);
	            succession.generateSuccessionWithSpecifications(specificationO);
	            result = succession.writeToFile(specificationF);
        	}    
            
            
        }else{
            result = "Opciones no validas.";
        }
    	
        return result;
    }
    	
    public static void main(String[] args){
        Program program = new Program();
        System.out.println(program.showSucession(args));
    }	
}
