import java.util.Scanner;

public class Ej5 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    double b;
    double h;
    double area;
    
    System.out.println("Introduzca la medida de la base del rectangulo");
    b = s.nextDouble();
    System.out.println("Introduzca la medida de la altura del rectangulo");
    h = s.nextDouble();
    area = (b * h);
    
    System.out.print("El area del rectangulo es: " + area + "metros");
  }
}
