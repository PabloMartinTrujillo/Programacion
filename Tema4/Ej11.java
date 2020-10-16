import java.util.Scanner;

public class Ej11  {
  public static void main (String[] args)  {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa calcula los segundos restantes de medianoche a la hora introducida");
    System.out.println("Introduzca una hora junto a los minutos");
    System.out.print("Hora: ");
    int h = s.nextInt();
    System.out.print("Minutos: ");
    int m = s.nextInt();
    
    if ((h<0) || (h>23)) {
      System.out.println("La hora introducida es incorrecta");
    }
    else {
    }
    if ((m<0) || (m>59)) {
      System.out.println("Los minutos introducidos no son correctos");
    }
    else {
    }
    
    int trans = ((h*3600) + (m*60));
    int total = (24*3600);
    
    int restante = (total - trans);
    System.out.println("Quedan " + restante + " segundos hasta medianoche");
  }
}
