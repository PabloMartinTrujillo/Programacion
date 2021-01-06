import java.util.Scanner;
public class Ej64 {
  public static void main (String[] args)
    throws InterruptedException {
    Scanner s = new Scanner(System.in);
    
    int respuesta=0;
    int anchura=6;
    int altura=3;
    int aux;
        
    do {
      /* Rectangulo */
      for (int i=0; i<anchura; i++) {
        System.out.print("*");
      }
      System.out.println();
      for (int i=0; i<altura-2; i++) {
        System.out.print("*");
        for (int q=0; q<anchura-2; q++) {
          System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
      }
      for (int i=0; i<anchura; i++) {
        System.out.print("*");
      }
      System.out.println();
      
      /* Opciones */
      if (anchura>2 || altura>2) {
        System.out.println("1. Agrandarlo");
        System.out.println("2. Achicarlo");
        System.out.println("3. Cambiar orientacion");
        System.out.println("4. Salir");
        System.out.print("Indique que quiere hacer con el rectangulo: ");
        respuesta=s.nextInt();
      }
      
      if (anchura==2 || altura==2) {
        do {
          System.out.println("1. Agrandarlo");
          System.out.println("3. Cambiar orientacion");
          System.out.println("4. Salir");
          System.out.print("Indique que quiere hacer con el rectangulo: ");
          respuesta=s.nextInt();
        } while (respuesta==2);
      }
      
      switch (respuesta) {
        case 1:
          anchura+=1;
          altura+=1;
          break;
        case 2:
          anchura-=1;
          altura-=1;
          break;
        case 3:
          aux=anchura;
          anchura=altura;
          altura=aux;
          break;
      }
    } while (respuesta!=4);
  }
}
