import java.util.Scanner;

public class Ej2 {
  public static void main (String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    System.out.println("Este programa escribe los numeros consecutivos al introducir la cantidad de numeros");
    System.out.println("Introduce la cantidad de numeros");
    int c = s.nextInt();
    System.out.println("Introduzca el numero a partir el cual se empezara a contar");
    int x = s.nextInt();
    
    for (int i=0; i<c; i++) {
      System.out.print(x);
      x = x+1;
      if (x>0) {
        System.out.print("-");
      }
    }
  }
}
