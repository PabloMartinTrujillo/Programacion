import java.util.Scanner;
public class Ej2 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    int[][] x= new int [4][5];
    int total=0;
    System.out.println("Este programa pide 20 numeros en un array bidimensional y muestra el total");
    
    for (int i=0; i<4; i++) {
      for (int j=0; j<5; j++) {
        x[i][j]=s.nextInt();
        total+=x[i][j];
      }
      System.out.println();
    }
    System.out.printf("El total es: "+total);
  }
}
