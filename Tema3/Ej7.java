import java.util.Scanner;

public class Ej7 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
      
    String a1;
    double p1;
    String a2;
    double p2;
    String a3;
    double p3;
    double total;
    
    System.out.println("Escriba el nombre del primero de tres tramites y a continuacion su precio");
    a1 = System.console().readLine();
    p1 = s.nextDouble();
    System.out.println("Escriba el nombre del segundo tramite y su precio");
    a2 = System.console().readLine();
    p2 = s.nextDouble();
    System.out.println("Escriba el nombre del tercer tramite y su precio");
    a3 = System.console().readLine();
    p3 = s.nextDouble();
    
    
    total = (p1 * 1.21) + (p2 * 1.21) + (p3 *1.21); 
    
    System.out.println("El precio total de la factura es: " + total);
    
  }
}
