import java.util.Scanner;

public class Ej9 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    double x1;
    double x2;
    
    System.out.println("Este programa calcula una ecuacion de segundo grado");
    System.out.println("Introduzca el valor de la variable a");
    double a = s.nextDouble();
    System.out.println("Introduzca el valor de b");
    double b = s.nextDouble();
    System.out.println("Introduzca el valor de c");
    double c = s.nextDouble();
    
    x1 = (-b+Math.sqrt((b*b)-4*a*c))/(2*a);
    x2 = (-b-Math.sqrt((b*b)-4*a*c))/(2*a);
    
    System.out.println("Los resultados de la ecuacion es: " + (float)x1 + " y " + (float)x2);
    
  }
}
