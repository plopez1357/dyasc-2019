package ar.edu.untref.dyasc;

public class Program {
	
    public String showSucession(String[] args){
        String result = "";
        
        if(validateIfHaveErrors(args) == false){
            if(args.length == 2){
    			
                int successionLength = Integer.parseInt(args[1]);
                String specification = args[0].substring(3,5);
                FormatSucession succession = new FormatSucession();
                result = succession.generateSuccessionWithSpecifications(specification, successionLength);
                
            }else{
	
                int successionLength = Integer.parseInt(args[0]);
                FormatSucession succession = new FormatSucession();
                result = succession.generateSuccessionWithSpecifications("", successionLength);
                
            }
        }else{
            result = "Opciones no validas.";
        }
    		
    	
        return result;
    }
    
    private boolean validateIfHaveErrors(String[] args){
    	
        if(args.length >= 1 && args.length <= 2){
            String specification = "";
            for(int i = 0; i < args.length; i++){
                specification += String.valueOf(args[i]); 
            }
            if(specification.matches("-o=[v|h][d|i][0-9]+") || specification.matches("[0-9]+")){
                return false;
    			
            }else {
                return true;
            }
        }else {
            return true;
        }		
    }
    	
    public static void main(String[] args){
        Program program = new Program();
        System.out.println(program.showSucession(args));
    }	
}
