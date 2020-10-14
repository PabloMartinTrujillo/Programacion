import java.util.Scanner;

public class Ej6 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    double g = 9.81;
    double h;
    double t;
    
    System.out.println("Este programa calcula el tiempo que tarda en caer un objeto desde una determinada altura");
    System.out.println("Introduzca la altura");
    h = s.nextDouble();
    
    if (h<0) {
      System.out.println("No se puede introducir una altura negativa");
    }
      else {
        t = Math.sqrt(2*h/g);
        System.out.printf("El objeto tardara %.4f segundos en llegar al suelo", t);
      }
  }
}
