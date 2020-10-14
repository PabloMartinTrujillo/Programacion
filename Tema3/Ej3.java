import java.util.Scanner;
public class Ej3 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    double p;
    double e;
    
    System.out.println("Introduzca la cantidad de pesetas que quiera convertir a euros");
    p = s.nextDouble();
    e = (p * 0.006);
    
    System.out.println(p + " pesetas son al cambio " + e + " euros");
  }
}
