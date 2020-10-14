import java.util.Scanner;

public class Ej12 {
  public static void main (String[] args)  {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa calcula la nota de un segundo examen necesaria para la media de evaluacion que desea");
    System.out.println("Introduzca la nota del primer examen");
    double n1 = s.nextDouble();
    System.out.println("Introduzca la nota deseada para la evaluacion");
    double ev = s.nextDouble();
    
    double n2 = (ev-(n1*0.4))/0.6;
    System.out.println("La nota necesaria del segundo examen es: " + n2);
    
  }
}
