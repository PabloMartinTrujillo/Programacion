public class Ej1 {
  public static void main (String[] args) {
    
    System.out.println("Introduce un entero");
    int x = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce otro entero");
    int y = Integer.parseInt(System.console().readLine());
    
    int mult = (x*y);
    
    System.out.print("El producto de " + x + " y de " + y + " es: ");
    System.out.print(mult);
  }
}