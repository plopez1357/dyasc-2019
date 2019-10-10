package ar.edu.untref.dyasc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {
	
	public String writeToFile(String fileName,String succession){
	
		if(fileName.contentEquals("")){
			
			return succession;
			
		}else{
			
			File file = new File(fileName);
	        
	        try{
	        
	            FileWriter fileWriter = new FileWriter(file);
	            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	            PrintWriter printWriter = new PrintWriter(bufferedWriter);  
	            
	            printWriter.println(succession); 
	            
	            printWriter.close();
	            bufferedWriter.close();
	        
	        }catch(IOException e){
	        	return "Error en el archivo";
	        }
			return "guardado en "+fileName;
		}
		
	}
	

}
