import java.util.Scanner;
public class Ej10 {
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    int[] x=new int [20];
    int[] par=new int [20];
    int[] impar=new int [20];
    int npares=0;
    int aux=0;
    int q=-1;
    int w=-1;
    
    for (int i=0; i<20; i++) {
      x[i]=(int)(Math.random()*101);
      if (x[i]%2==0) {
        q+=1;
        npares+=1;
        par[q]=x[i];
      }
      else{
        w+=1;
        impar[w]=x[i];
      }
    }
    for (int i=0; i<npares; i++) {
      x[i]=par[i];
    }
    w=-1;
    for (int i=npares; i<20; i++) { /* No almaceno nimpares y pongo 20 porque nimpares+npares=20 */
      w+=1;
      x[i]=impar[w];
    }
    for (int i=0; i<20; i++) {
      System.out.print(x[i]+" ");
    }
  }
}
