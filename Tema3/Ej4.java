public class Ej4 {
  public static void main (String[] args) {
  
    int nUno;
    int nDos;   
   
    System.out.println("Por favor, introduce un entero");
    nUno = Integer.parseInt (System.console().readLine());
    System.out.println("Introduzca otro entero");
    nDos = Integer.parseInt( System.console().readLine() );

    System.out.println("La suma es = " + (nUno + nDos));
    System.out.println("La resta es = " + (nUno - nDos));
    System.out.println("La multiplicacion es : " + (nUno * nDos));
    System.out.println("La division es : " + (nUno / nDos));

  }
}
