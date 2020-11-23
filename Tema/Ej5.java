import java.util.Scanner;
public class Ej5 {
  public static void main (String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    int max=199;
    int min=100;
    int sum=0;
    
    for (int i=0; i<50; i++) {
      int n=(int)(Math.random()*100)+100;
      sum+=n;
      System.out.print(n + " ");
      if (n<min) {
        min=n;
      }
      if (n>max) {
        max=n;
      }
    }
    System.out.println("El minimo es: " + min);
    System.out.println("El maximo es: " + max);
    System.out.println("La suma es: " + sum);
  }
}
  
