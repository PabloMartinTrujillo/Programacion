import java.util.Scanner;
public class Ej8 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);

    int w=1;
    
    for (int q=0; q<=w; q++) {
      System.out.println("Introduce un numero por teclado para realizar su cuadrado (0 para salir)");
      int n = s.nextInt();
      if (n==0) {
        System.out.print("Hasta luego");
        q=w+1;
      }
      else {
        w=w+1;
        int cuad= n*n;
        System.out.printf("%s ^ 2 = %s\n",n,cuad);
      }
    }
  }
}
