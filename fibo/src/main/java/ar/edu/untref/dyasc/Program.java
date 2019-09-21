package ar.edu.untref.dyasc;

public class Program {

	public static void main(String[] args) {
           String data = String.valueOf(args[0]);
		   int number = Integer.parseInt(data);
		   FibonacciSuccession fibonacciSuccession = new FibonacciSuccession();
		   System.out.print("fibo<"+number+">:");
	       for (int i = 0; i < number; i++) {
	           System.out.print(fibonacciSuccession.calculateFibonacciSuccession(i)+" ");
	       }
               System.out.println();
	   }

}
