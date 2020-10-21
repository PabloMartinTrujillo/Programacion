import java.util.Scanner;

public class Ej9 {
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa captura un numero y dice de cuantos digitos esta compuesto");
    System.out.println("Introduzca el numero");
    int n = s.nextInt();
    int c=0;
    
    for (int i=0; i<=c; i++) {
      if (n>=10) {
        n = n/10;
        c = c+1;
      }
      else {
        c = c+1;
        i = c+1;
      }
    }
    System.out.println("El numero tiene " + c + " digitos");
  }
}
