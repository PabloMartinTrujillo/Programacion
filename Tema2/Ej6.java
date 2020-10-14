public class Ej6 {
  public static void main (String[] args) {
    double x;
    double y;
    double sinIVA;
    double z;
    
    x = 43.75;
    y = 15.20;
    sinIVA = x + y;
    z = (x + y) * 1.21;
    
    System.out.printf("%-20s %s", "Articulo", "Precio \n");
    System.out.println("---------------------------");
    System.out.println("Precio sin IVA");
    System.out.printf("%-20s %s", "Altavoces", x);
    System.out.println();
    System.out.printf("%-20s %s", "Pelota", y);
    System.out.println();
    System.out.println("---------------------------");
    System.out.printf("%-20s %s", "", sinIVA);
    System.out.println();
    System.out.printf("%-20s %s", "Total con IVA:", z);
  }
}
