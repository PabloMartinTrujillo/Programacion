import java.util.Scanner;
public class Ej4 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    int[] numero=new int [20];
    int[] cuadrado=new int [20];
    int[] cubo=new int [20];
    
    for (int i=0; i<20; i++) {
      int n=(int)(Math.random()*101);
      numero[i]=n;
      cuadrado[i]=n*n;
      cubo[i]=n*n*n;
    }
    for (int g=0; g<20; g++) {
      System.out.print("El numero es: " + numero[g]);
      System.out.print(" - El cuadrado es: " + cuadrado[g]);
      System.out.println(" - El cubo es: " + cubo[g]);
    }
  }
}
