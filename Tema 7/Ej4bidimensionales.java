import java.util.Scanner;
public class Ej4 {
  public static void main (String[] args)
    throws InterruptedException {
    Scanner s = new Scanner(System.in);
    
    final int FILAS=4;
    final int COLUMNAS=5;
    
    int[][] x= new int [FILAS][COLUMNAS];
    int total=0;
    System.out.println("Este programa muestra el total de un array bidimensional a partir de numeros aleatorios entre 100 y 999");
    
    for (int i=0; i<4; i++) {
      for (int j=0; j<5; j++) {
        x[i][j]=(int)(Math.random()*900)+100;
        total+=x[i][j];
      }
      System.out.println();
    }
    System.out.print("Pensando...");
    for (int q=0; q<3; q++) {
      Thread.sleep(1000);
      System.out.print(" ...");
    }
    Thread.sleep(1000);
    System.out.println();
    System.out.printf("El total es: "+total);
  }
}
