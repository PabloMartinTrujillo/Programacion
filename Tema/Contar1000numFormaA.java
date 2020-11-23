import java.util.Scanner;
public class Contar1000numFormaA {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    int c1=0;
    int c2=0;
    int c3=0;
    int c4=0;
    int c5=0;
    int c6=0;
    
    for (int i=0; i<1000; i++) {
      do {
        int a= (int)(Math.random()*6)+1;
        int b= (int)(Math.random()*6)+1;
        int c= (int)(Math.random()*6)+1;
      } while ((b==a)||(c===b)||(c==a));
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
  }
}
