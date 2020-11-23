import java.util.Scanner;
public class Ej5 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    int[] x=new int [10];
    int max=-999999999;
    int min=999999999;
    
    for (int i=0; i<10; i++) {
      int n=s.nextInt();
      x[i]=n;
      if (n<min) {
        min=x[i];
      }
      if (n>max) {
        max=x[i];
      }
    }
    System.out.println("El maximo es: " + max);
    System.out.println("EL minimo es: " + min);
  }
}
