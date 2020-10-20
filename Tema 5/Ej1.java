import java.util.Scanner;

public class Ej1 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    int n = 0;
    System.out.println("Este programa muestra los multiplos de 5 hasta 100"); 
    
    for (int i=0; i<20; i++) {     /* 100/5=20*/
      n = n+5;
      System.out.println(n);
    }
  }
}
