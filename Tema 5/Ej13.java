import java.util.Scanner;

public class Ej13 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa dice cuantos numeros negativos hay de 10 introducidos");
    int cont=0;
    int pos=10;
    
    for (int i=0; i<10; i++) {
      int n = s.nextInt();
      if (n<0) {
        cont = cont+1;
        pos = pos-1;
      }
     }   
    System.out.printf("Hay %s numeros negativos y %s positivos",cont,pos);
  }
}
