import java.util.Scanner;
public class Ej9 {
  public static void main (String[] args) {547
    

    Scanner s = new Scanner(System.in);
    
    int[] x= new int [8];
    System.out.println("Introduzca 8 numeros para determinar si son pares o impares");
    
    for (int i=0; i<8; i++) {
      x[i]=s.nextInt();
    }
    for (int i=0; i<8; i++) {
      if (x[i]%2==0) {
        System.out.println(x[i]+" par");
      }
      else {
        System.out.println(x[i]+" impar");
      }
    }
  }
}
