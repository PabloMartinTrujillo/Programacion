import java.util.Scanner;

public class Ej9 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    double r;
    double h;
    double vol;
    
    System.out.println("Introduzca radio del cono");
    r = s.nextDouble();
    System.out.println("Introduzca altura del cono");
    h = s.nextDouble();
    
    vol = ((1/3)*3.1416*(r*r)*h);
    
    System.out.println("El volumen del cono es: " + vol + " m ³");  /** NO FUNCIONA*/
  }
}
