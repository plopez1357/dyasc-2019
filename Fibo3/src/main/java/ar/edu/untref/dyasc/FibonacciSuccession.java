package ar.edu.untref.dyasc;

public class FibonacciSuccession { 

   private int calculatePositionOfFibonacciSuccession(int position){
	   
      if (position > 1){
        return calculatePositionOfFibonacciSuccession(position-1) 
        + calculatePositionOfFibonacciSuccession(position-2);  
      }
      else if (position == 1) { 
        return 1;
      }
      else if (position == 0){  
        return 0;
      }
	return position;
   }
   
   public int[] calculateFibonacciSuccession(int successionLength){
      int fibonacciSuccession[] = new int[successionLength];
	  
      for(int i = 0; i < successionLength; i++){
          fibonacciSuccession[i] = calculatePositionOfFibonacciSuccession(i);
      }
      return fibonacciSuccession;
   }
}
