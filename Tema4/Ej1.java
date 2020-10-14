import java.util.Scanner;

public class Ej1 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca un numero de dia de lunes a viernes");  
    int dia = Integer.parseInt(System.console().readLine());
    
    switch (dia) {
      case 1:
        System.out.println("A primera hora tienes Programacion");
        break;
      case 2:
        System.out.println("A primera hora tienes Sistemas Informaticos");
        break;
      case 3:
        System.out.println("A primera hora tienes Programacion");
        break;
      case 4:
        System.out.println("A primera hora tienes Programacion");
        break;
      case 5:
        System.out.println("A primera hora tienes Sistemas informaticos");
        break;
    }
  }
}
