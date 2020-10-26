import java.util.Scanner;

public class Ej10mod {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    String a;
    float d = 0;
    float w = 0;
    System.out.println("Este programa calcula la media de numeros introducidos por teclado");
    System.out.println("Cuando no desee introducir mas numeros, introduzca uno negativo");
    
    for (int i=0; i<=9; i++) {
      float e = s.nextFloat();
      if (e<0) {
        w= w/2;
        System.out.println("La media es :" + w);
        i=10;
      }
      else {
        d = e + d;
        w = d;
        a = e + "->" + w;
        System.out.println(a);
        if ((i<10) && (i>8)) {
          w= w/2;
          System.out.println("La media es :" + w);
        }
      }

    }
  }
}
