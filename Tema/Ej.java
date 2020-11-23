import java.util.Scanner;
public class Ej {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int cont=0;
    
    for (int i=0; i<1000; i++) {
      int a= (int)(Math.random()*6)+1;
      int b= (int)(Math.random()*6)+1;
      int c= (int)(Math.random()*6)+1;
      if ((a==b)&&(b==c)&&(a==c)) {
        cont++;
      }      
    }
    System.out.print(cont);
  }
}
