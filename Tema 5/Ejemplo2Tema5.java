import java.util.Scanner; 
public class Ejemplo2Tema5  {
  public static void main (String[] args)  {

    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca dos numeros para realizar su suma");
    for (int i=0; i<=9; i++)  {
      System.out.print("Entero 1: ");
      int x = s.nextInt();
      System.out.println("");
      System.out.print("Entero 2: ");
      int y = s.nextInt();
      System.out.println("");
      int suma =x+y;
      System.out.println("La suma es: " + suma);
    }
  }
}
