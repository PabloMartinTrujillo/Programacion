import java.util.Scanner;
public class EjClase {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    int[] array1=new int [5];
    int[] array2=new int [8];
    int[] array3=new int [13];
    
    System.out.println("Introduzca los numeros del array1");
    for (int i=0; i<5; i++) {
      array1[i]=s.nextInt();
    }
    System.out.println("Introduzca los numeros del array2");
    for (int i=0; i<8; i++) {
      array2[i]=s.nextInt();
    }
    for (int i=0; i<5; i++) {
      array3[i]=array1[i];
    }
    int i=-1;
    for (int q=5; q<13; q++) {
      i++;
      array3[q]=array2[i];
    }
    System.out.print("El array3 es: ");
    for (int w=0; w<13; w++) {
      System.out.print(array3[w]+" ");
    }
  }
}
