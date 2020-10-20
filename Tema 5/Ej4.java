import java.util.Scanner;

public class Ej4 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    int n = 340;
    System.out.println("Este programa muestra los numeros de 320 a 160 de 20 en 20");
    
    for (int i=8; i>=0; i--) {
      n = n-20;
      System.out.println(n);
    }
  }
}
