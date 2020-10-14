import java.util.Scanner;

public class Ej7 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    double n1;
    double n2;
    double n3;
    double nm;
    
    System.out.println("Este programa calcula la nota media a partir de 3 notas");
    System.out.println("Introduzca la nota 1");
    n1 = s.nextDouble();
    System.out.println("Introduzca la nota 2");
    n2 = s.nextDouble();
    System.out.println("Introduzca la nota 3");
    n3 = s.nextDouble();
    
    if ((n1<0) || (n1>10) || (n2<0) || (n2>10) || (n3<0) || (n3>10)) {
      System.out.println("Introduzca notas validas, entre 0 y 10");
    }
      else {
        nm = ((n1 + n2 + n3)/3);
        System.out.printf("La nota media es %.2f ", nm);
    }
  }
}
