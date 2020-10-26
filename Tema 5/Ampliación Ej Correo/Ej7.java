import java.util.Scanner;
public class Ej7 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce la altura");
    int n = s.nextInt();
    
    int esp=n;
    int g=n;
    int e=0;
    int j=0;
    int y=1;
    
    for (int i=0; i<n; i++) {
      esp=esp-1;
      e=e+1;
      for (int q=0; q<esp; q++) {
        System.out.print("\u0020");
      }
      for (int w=0; w<=i; w++) {
        System.out.print(e);
      }
      System.out.println();
    }
    System.out.println();
    
    esp=n;
    for (int k=0; k<n; k++) {
      esp=esp-1;
      j=j+1;
      for (int l=0; l<esp; l++) {
        System.out.print("\u0020");
      }
      for (int h=0; h<j; h++) {
        System.out.print(g);
      }
      g=g-1;
      System.out.println();
    }
    System.out.println();
    
    esp=n;
    for (int x=0; x<n; x++) {
      y=1;
      esp=esp-1;
      for (int r=0; r<esp; r++) {
        System.out.print("\u0020");
      }
      for (int t=0; t<=x; t++) {
        System.out.print(y);
        y=y+1;
      }
      System.out.println();
    }
  }
}
