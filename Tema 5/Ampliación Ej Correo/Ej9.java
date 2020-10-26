import java.util.Scanner;
public class Ej9 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    for (int q=0; q<=3; q++) {
      System.out.println("Introduce un numero por teclado para realizar su cuadrado (0 para salir)");
      int n = s.nextInt();
      if (n==0) {
        System.out.print("Hasta luego");
        q=5;
      }
      else {
        int cuad= n*n;
        System.out.printf("%s ^ 2 = %s\n",n,cuad);
      }
    }
  }
}
