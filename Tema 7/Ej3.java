import java.util.Scanner;
public class Ej3 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.println("Estre programa recoje 10 numeros y los muestra al reves");
    int[] x=new int [10];
    
    for (int i=0; i<=9; i++) {
      int n = s.nextInt();
      x[i]=n;
    }
    for (int g=9; g>=0; g--) {
      System.out.print(x[g] + " ");
    }
  }
}
