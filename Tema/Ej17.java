import java.util.Scanner;
public class Ej17 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    boolean pez=false;
    
    System.out.print("Introduzca la altura de la pecera(min 4): ");
    int h=s.nextInt();
    System.out.print("Introduzca la anchura de la pecera(min 4): ");
    int a=s.nextInt();
    int esp=(a*2)-3;
    int contpez=0;
    int contcontpez=0;
    
    for (int i=0; i<h; i++) {
      if ((i==0) || (i==h)) {
        for (int u=0; u<a; u++) {    
          System.out.print("*");
          System.out.print(" ");
        }
        System.out.println();
      }
      else  {
        System.out.print("*");
        int x=(int)(Math.random()*8);
        if (x==2) {
          contpez++;
        }
        for (int q=0; q<esp; q++) {  
          if (contpez==1) {
            if (contcontpez==1) {
              System.out.print(" ");
            }
            else {
              System.out.print("&");
              contpez=5;
              contcontpez++;
            }
          }
          else {
            System.out.print(" ");
          }
        }
          System.out.print("*");
          System.out.println();
    }
  }
}
