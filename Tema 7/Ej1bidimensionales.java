import java.util.Scanner;
public class Ej1 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    
    int[][] x=new int [3][6];
    x[0][0]=0;
    x[0][1]=30;
    x[0][2]=2;
    x[0][5]=5;
    x[1][0]=75;
    x[1][4]=0;
    x[2][2]=-2;
    x[2][3]=9;
    x[2][5]=11;
    
    for (int i=0; i<3; i++) {
      for (int j=0; j<6; j++) {
        System.out.print(x[i][j]+" ");
      }
      System.out.println();
    }
  }
}
