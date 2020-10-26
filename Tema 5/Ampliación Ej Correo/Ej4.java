import java.util.Scanner; 

public class Ej4 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Este programa muestra numeros descendientemente desde un numero dado a otro y con saltos");
    System.out.println("Introduzca el numero mas alto");
    int x = s.nextInt();
    System.out.println("Introduzca el numero mas bajo");
    int y = s.nextInt();
    System.out.println("Introduzca el numero de saltos");
    int q = s.nextInt();
    
    for (int i=0; i<=x; i++) {
      if (x>=y) {
        System.out.print(x + "-");
        x = (x-q);
      } 
      if (x<y) {
        i = x*2;
      }
    }
  }
}
