import java.util.Scanner;

public class Ej3 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Escriba un numero del 1-7 para saber el dia de la semana");
    int dia = Integer.parseInt(System.console().readLine());
    
    switch (dia) {
      case 1:
        System.out.println("El 1 es el lunes");
        break;
      case 2:
        System.out.println("EL 2 es el martes");
        break;
      case 3:
        System.out.println("El 3 es el miercoles");
        break;
      case 4:
        System.out.println("El 4 es el jueves");
        break;
      case 5:
        System.out.println("El 5 es el viernes");
        break;
      case 6:
        System.out.println("El 6 es el sabado");
        break;
      case 7:
        System.out.println("El 7 es el domingo");
        break;
    }
  }
}
