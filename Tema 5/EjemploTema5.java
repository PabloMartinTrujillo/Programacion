import java.util.Scanner;

public class EjemploTema5  {
  public static void main (String[] args)  {
   
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor introduzca una frase");
    String frase = System.console().readLine();
    System.out.println("Introduzca el numero de veces que quiere que se repita");
    int x = s.nextInt();
    
    for (int i=0; i<x; i++) {
      System.out.println(frase);
    }
  }
}
