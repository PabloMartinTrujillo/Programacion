import java.util.Scanner;
public class Ej3 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    int[][] x= new int [4][5];
    int total=0;
    System.out.println("Este programa muestra el total de un array bidimensional a partir de numeros aleatorios entre 100 y 999");
    
    for (int i=0; i<4; i++) {
      for (int j=0; j<5; j++) {
        x[i][j]=(int)(Math.random()*900)+100;
        total+=x[i][j];
      }
      System.out.println();
    }
    System.out.printf("El total es: "+total);
  }
}
