import java.util.Scanner;

public class Ej8 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    int e;
    double h;
    double total;
    e = 12;
    
    System.out.println("Introduzca las horas trabajadas en la semana");
    h = s.nextDouble();
    total = (e * h);
    
    System.out.println("");
    System.out.println("El salario semanal por las horas trabajadas es: " + total + " euros");
    
  }
}
