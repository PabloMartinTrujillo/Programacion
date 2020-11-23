import java.util.Scanner;
public class Ej8 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    int[] x=new int [12];
    String[] mes= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    System.out.println("Introduzca la temperatura media de cada mes del año");
    
    for (int i=0; i<12; i++) {
      System.out.print(mes[i]+": ");
      x[i]=s.nextInt();
    }
    System.out.print("Introduzca el caracter con el que rellenar la barra del diagrama: ");
    String w= System.console().readLine();
    for (int i=0; i<12; i++) {
      System.out.print(mes[i]+" ");
      for (int q=0; q<x[i]; q++) {
        System.out.print(w);
      }
      System.out.println();
    }
  }
}
