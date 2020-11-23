import java.util.Scanner;
public class Ej7 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    int[] x=new int [100];
    System.out.println("Introduzca dos valores, el primero entre 0 y 20");
    int n1=s.nextInt();
    int n2=s.nextInt();
    
    for(int i=0; i<100; i++) {
      int y=(int)(Math.random()*21);
      x[i]=y;
      if (x[i]==n1) {
        System.out.print("'"+n2+"'"+ " ");
      }
      else {
        System.out.print(x[i]+" ");
      }
    }
  }
}
