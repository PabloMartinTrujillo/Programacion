import java.util.Scanner;
public class Ej5 {
  public static void main (String[] args)
    throws InterruptedException {
    Scanner s = new Scanner(System.in);
    
    final int FILAS=6;
    final int COLUMNAS=10;
    int max=-1;
    int min=1001;
    int imax=0;
    int jmax=0;
    int imin=0;
    int jmin=0;
    int[][] x= new int [FILAS][COLUMNAS];
    
    for (int i=0; i<FILAS; i++) {
      for (int j=0; j<COLUMNAS; j++) {
        x[i][j]=(int)(Math.random()*1001);
        System.out.print(x[i][j]+" ");
        if (x[i][j]<min) {
          min=x[i][j];
          imin=i;
          jmin=j;
        }
        if (x[i][j]>max) {
          max=x[i][j];
          imax=i;
          jmax=j;
        }
      }
      System.out.println();
    }
    System.out.println("La posicion del numero maximo es x["+imax+"]["+jmax+"]");
    System.out.println("La posicion del numero minimo es x["+imin+"]["+jmin+"]");
  }
}
