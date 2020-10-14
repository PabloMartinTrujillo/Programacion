import java.util.Scanner;

public class Ej6 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    double b;
    double h;
    double area;
    
    System.out.println("Introduzca la base de el triangulo");
    b = s.nextDouble();
    System.out.println("Introduzca la altura del triangulo");
    h = s.nextDouble();
    area = (b * h) / 2;
    
    System.out.println("El area del triangulo es: " + area);
    
  }
}
