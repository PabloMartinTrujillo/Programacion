import java.util.Scanner;

public class Ej1 {
  public static void main (String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    System.out.println("Este programa escribe los numeros consecutivos al introducir la cantidad de numeros");
    System.out.println("Introduce la cantidad de numeros");
    int c = s.nextInt();
    int x = 0;
    
    for (int i=0; i<c; i++) {
      x = x+1;
      System.out.print(x);
      if ((x>0) && (x<c)) {
        System.out.print("-");
      }
    }
  }
}
