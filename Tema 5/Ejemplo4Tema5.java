import java.util.Scanner;

public class Ejemplo4Tema5 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa muestra las potencias deseadas de un numero");
    System.out.println("Escriba el numero que desea para elevar");
    int n = s.nextInt();
    System.out.println("Introduzca las veces que quiere que sea elevado");
    int fi = s.nextInt();
    int uno = 0;
    int elev = 1;
     
    for (int i=0; i<fi; i++) {
      if (uno<=fi) {
      uno = uno +1;
      elev = elev*n;        
      System.out.printf("%s ^ %s = %s",n,uno,elev); 
      System.out.println(""); 
      }    
    }
  }
}
