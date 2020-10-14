import java.util.Scanner;

public class Ej5 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    double x;
    
    System.out.println("Este programa resuelve ecuaciones del tipo: ax+b=0");
    System.out.println("Introduce el valor de a");
    double a = s.nextDouble();
    System.out.println("Introduce el valor de b");
    double b = s.nextDouble();
    x = -b/a;
    
    if (a==0) {
      System.out.println("No se puede resolver");
    }
      else {        
      System.out.println("El resultado de la ecuacion es x= " + x);
    }
  }
}
