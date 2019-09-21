package ar.edu.untref.dyasc;

public class Program {

	public static void main(String[] args) {
		String data = "";
		for(int i = 0;i<args.length;i++){
			data += String.valueOf(args[i]);
		}
		ShowSuccession succession = new ShowSuccession();
		String resultSuccession = succession.showSucession(data);
		System.out.println(resultSuccession);
	}	
}
