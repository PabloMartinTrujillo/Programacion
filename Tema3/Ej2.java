import java.util.Scanner;
public class Ej2 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    double e;
    double p;
    
    System.out.println("Introduzca la cantidad de euros que desea convertir a pesetas");
    e = s.nextDouble();
    p = (e * 166.386);
    
    System.out.println(e + " euros son al cambio " + p + " pesetas");
  }
}
