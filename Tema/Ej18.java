import java.util.Scanner;
public class Ej18 {
  public static void main (String [] args) {

    Scanner s = new Scanner(System.in);
    
    
    int q1=(int)(Math.random()*6)+1;
    int q2=(int)(Math.random()*6)+1;
    while (q2==q1) {
      q2=(int)(Math.random()*6)+1;
    }
    int q3=(int)(Math.random()*6)+1;
    while ((q3==q2)||(q3==q1)) {
      q3=(int)(Math.random()*6)+1;
    }
    int w1=(int)(Math.random()*6)+1;
    int w2=(int)(Math.random()*6)+1;
    while (w2==w1) {
      w2=(int)(Math.random()*6)+1;
    }
    int w3=(int)(Math.random()*6)+1;
    while ((w3==w2)||(w3==w1)) {
      w3=(int)(Math.random()*6)+1;
    }
    int e1=(int)(Math.random()*6)+1;
    int e2=(int)(Math.random()*6)+1;
    while (e2==e1) {
      e2=(int)(Math.random()*6)+1;
    }
    int e3=(int)(Math.random()*6)+1;
    while ((e3==e2)||(e3==e1)) {
      e3=(int)(Math.random()*6)+1;
    }
    switch (q1) {
      case 1:
        String c1="rojo";
        break;
      case 2:
        c1="azul";
        break;
      case 3:
        c1="verde";
        break;
      case 4:
        c1="amarillo";
        break;
      case 5:
        c1="violeta";
        break;
      case 6:
        c1="naranja";
        break;
    }
    switch (q2) {
      case 1:
        String c2="rojo";
        break;
      case 2:
        c2="azul";
        break;
      case 3:
        c2="verde";
        break;
      case 4:
        c2="amarillo";
        break;
      case 5:
        c2="violeta";
        break;
      case 6:
        c2="naranja";
        break;
    }
    switch (q3) {
      case 1:
        String c3="rojo";
        break;
      case 2:
        c3="azul";
        break;
      case 3:
        c3="verde";
        break;
      case 4:
        c3="amarillo";
        break;
      case 5:
        c3="violeta";
        break;
      case 6:
        c3="naranja";
        break;
    }
    switch (w1) {
      case 1:
        String v1="rojo";
        break;
      case 2:
        v1="azul";
        break;
      case 3:
        v1="verde";
        break;
      case 4:
        v1="amarillo";
        break;
      case 5:
        v1="violeta";
        break;
      case 6:
        v1="naranja";
        break;
    }
    switch (w2) {
      case 1:
        String v2="rojo";
        break;
      case 2:
        v2="azul";
        break;
      case 3:
        v2="verde";
        break;
      case 4:
        v2="amarillo";
        break;
      case 5:
        v2="violeta";
        break;
      case 6:
        v2="naranja";
        break;
    }
    switch (w3) {
      case 1:
        String v3="rojo";
        break;
      case 2:
        v3="azul";
        break;
      case 3:
        v3="verde";
        break;
      case 4:
        v3="amarillo";
        break;
      case 5:
        v3="violeta";
        break;
      case 6:
        v3="naranja";
        break;
    }
    switch (e1) {
      case 1:
        String b1="rojo";
        break;
      case 2:
        b1="azul";
        break;
      case 3:
        b1="verde";
        break;
      case 4:
        b1="amarillo";
        break;
      case 5:
        b1="violeta";
        break;
      case 6:
        b1="naranja";
        break;
    }
    switch (e2) {
      case 1:
        String b2="rojo";
        break;
      case 2:
        b2="azul";
        break;
      case 3:
        b2="verde";
        break;
      case 4:
        b2="amarillo";
        break;
      case 5:
        b2="violeta";
        break;
      case 6:
        b2="naranja";
        break;
    }
    switch (e3) {
      case 1:
        String b3="rojo";
        break;
      case 2:
        b3="azul";
        break;
      case 3:
        b3="verde";
        break;
      case 4:
        b3="amarillo";
        break;
      case 5:
        b3="violeta";
        break;
      case 6:
        b3="naranja";
        break;
    }
    System.out.println("La habitacion 1 tiene los colores "+c1+" "+c2+" "+c3);
    System.out.println("La habitacion 1 tiene los colores "+v1+" "+v2+" "+v3);
    System.out.println("La habitacion 1 tiene los colores "+b1+" "+b2+" "+b3);
  }
}
