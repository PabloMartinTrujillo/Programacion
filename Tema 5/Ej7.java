import java.util.Scanner;

public class Ej7 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);

    int d = 5;
    
    System.out.println("Para abrir una caja fuerte se necesitan 4 digitos");
    
    for (int i=0; i<=3; i++) {
      d = d-1;
      System.out.printf("Tiene %s oportunidades\n",d);
      int e = s.nextInt();
      if ((e>1244) && (e<1246)) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        i=5;
      }
      else {
        System.out.println("Lo siento, esa no es la combinacion");
      }
      if ((i>3) && (i<5)) {
        System.out.println("Se ha quedado sin oportunidades");
      }
    }
  }
}
