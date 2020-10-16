import java.util.Scanner;

public class Ej10  {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca su numero del mes de nacimiento para saber su horoscopo");
    int mes = s.nextInt();
    System.out.println("Introduzca su dia de nacimiento del mes");
    int dia = s.nextInt();
    
    if ((mes<=0) || (mes>=13)) {
      System.out.println("El mes introducido no es valido");
    }
    else {
    }
    if ((dia<=0) || (dia>=31)) {
      System.out.println("El dia del mes introducido no es valido");
    }
    else {
    }
    
    switch (mes) {
      case 4:
        if (dia<=20) {
          System.out.println("Tu horoscopo es Aries");
        }
          else {
            System.out.println("Tu horoscopo es Tauro");
          }
        break;
      case 5:
        if (dia<=20) {
          System.out.println("Tu horoscopo es Tauro");
        }
          else {
            System.out.println("Tu horoscopo es Geminis");
          }
        break;
      case 6:
        if (dia<=20) {
          System.out.println("Tu horoscopo es Geminis");
        }
          else {
            System.out.println("Tu horoscopo es Cancer");
          }
        break;
      case 7:
        if (dia<=20) {
          System.out.println("Tu horoscopo es Caner");
        }
          else {
            System.out.println("Tu horoscopo es Leo");
          }
        break;
      case 8:
        if (dia<=21) {
          System.out.println("Tu horoscopo es Leo");
        }
          else {
            System.out.println("Tu horoscopo es Virgo");
          }
        break;
      case 9:
        if (dia<=22) {
          System.out.println("Tu horoscopo es Virgo");
        }
          else {
            System.out.println("Tu horoscopo es Libra");
          }
        break;
      case 10:
        if (dia<=22) {
          System.out.println("Tu horoscopo es Libra");
        }
          else {
            System.out.println("Tu horoscopo es Escorpio");
          }
        break;
      case 11:
        if (dia<=22) {
          System.out.println("Tu horoscopo es Escorpio");
        }
          else {
            System.out.println("Tu horoscopo es Sagitario");
          }
        break;
      case 12:
        if (dia<=20) {
          System.out.println("Tu horoscopo es Sagitario");
        }
          else {
            System.out.println("Tu horoscopo es Capricornio");
          }
        break;
      case 1:
        if (dia<=19) {
          System.out.println("Tu horoscopo es Capricornio");
        }
          else {
            System.out.println("Tu horoscopo es Acuario");
          }
        break;
      case 2:
        if (dia<=18) {
          System.out.println("Tu horoscopo es Acuario");
        }
          else {
            System.out.println("Tu horoscopo es Piscis");
          }
        break;
      case 3:
        if (dia<=20) {
          System.out.println("Tu horoscopo es Piscis");
        }
          else {
            System.out.println("Tu horoscopo es Aries");
          }
        break;
    }
  }
}
