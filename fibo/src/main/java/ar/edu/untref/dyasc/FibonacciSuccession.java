package ar.edu.untref.dyasc;

public class FibonacciSuccession {

   public int calculateFibonacciSuccession(int number){
      if (number>1){
        return calculateFibonacciSuccession(number-1) 
        + calculateFibonacciSuccession(number-2);  //función recursiva
      }
      else if (number==1) {  // caso base
        return 1;
      }
      else if (number==0){  // caso base
        return 0;
      }
	return number;
   }
}
