import java.util.Scanner;
public class Ej6 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    int[] x=new int [16];
    int[] y=new int [16];
    int i=0;
    
    for (i=0; i<15; i++) {
      int n=s.nextInt();
      x[i]=n;
    }
    int aux=x[14];
    for (i=14; i>0; i--) {
      x[i]=x[i-1];
    }
    x[0]=aux;
    for (i=0; i<15; i++) {
      System.out.println(x[i]);
    }
  }
}
