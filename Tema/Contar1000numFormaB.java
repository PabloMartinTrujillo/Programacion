import java.util.Scanner;
public class Contar1000numFormaB {
  public static void main (String[] args) {

    Scanner s =  new Scanner(System.in);
    int c1=0;
    int c2=0;
    int c3=0;
    int c4=0;
    int c5=0;
    int c6=0;
    
    for (int i=0; i<1000; i++) {
      int a = (int)(Math.random()*6)+1;
      int b = (int)(Math.random()*6)+1;
      while (b==a) {
        b=(int)(Math.random()*6)+1;
      }
      int c = (int)(Math.random()*6)+1;
      while ((c==a)||(c==b)) {
        c=(int)(Math.random()*6)+1;
      }
      switch (a) {
        case 1:
          c1++;
          break;
        case 2:
          c2++;
          break;
        case 3:
          c3++;
          break;
        case 4:
          c4++;
          break;
        case 5:
          c5++;
          break;
        case 6:
          c6++;
          break;
      }
      switch (b) {
        case 1:
          c1++;
          break;
        case 2:
          c2++;
          break;
        case 3:
          c3++;
          break;
        case 4:
          c4++;
          break;
        case 5:
          c5++;
          break;
        case 6:
          c6++;
          break;
      }
      switch (c) {
        case 1:
          c1++;
          break;
        case 2:
          c2++;
          break;
        case 3:
          c3++;
          break;
        case 4:
          c4++;
          break;
        case 5:
          c5++;
          break;
        case 6:
          c6++;
          break;
      }
    }
    System.out.printf("El numero 1 ha salido %s veces\n", c1);
    System.out.printf("El numero 2 ha salido %s veces\n", c2);
    System.out.printf("El numero 3 ha salido %s veces\n", c3);
    System.out.printf("El numero 4 ha salido %s veces\n", c4);
    System.out.printf("El numero 5 ha salido %s veces\n", c5);
    System.out.printf("El numero 6 ha salido %s veces\n", c6);
  }
}
