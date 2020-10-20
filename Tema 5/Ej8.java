import java.util.Scanner;

public class Ej8 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa muestra la tabla de multiplicar con las filas deseadas");
    System.out.println("Escriba el numero que desea para la tabla de multiplicar");
    int n = s.nextInt();
    System.out.println("Introduzca el numero de filas");
    int fi = s.nextInt();
    int uno = 0;
     
    for (int i=0; i<fi; i++) {
        if (uno<=fi) {
          uno = uno + 1;
          int mult = n*uno;
          System.out.printf("%s * %s = %s",n,uno,mult);
          System.out.println("");
        }
        else {
        }
    }
  }
}
