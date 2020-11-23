import java.util.Scanner;
public class Ej1 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    int t=0;
    System.out.println("Este programa muestra la tirada y la suma de 3 dados");
    
    for (int i=0; i<3; i++) {
      int x=(int)(Math.random()*6)+1;
      t+=x;
      System.out.println(x);
    }
    System.out.print(t);
  }
}
