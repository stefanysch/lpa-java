package lpa;

public class BreakContinue {
  
    public static void main(String[] args) {
      for(int numero = 1; numero <= 5;numero ++){
        if(numero == 3)
          continue; //break 
        
        System.out.println(numero);
      }
    }
  }