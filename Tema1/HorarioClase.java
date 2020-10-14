public class HorarioClase {
  public static void main (String[] args){
    System.out.println("┌────────┬────────┬────────┬────────┬────────┐"); 
    System.out.printf("%-10s %-10s %-9s %-5s %s \n" , "│    L   │", "   M   │", " X   │ ", "J   │", "   V   │");
    System.out.println("├────────┼────────┼────────┼────────┼────────┤");
    System.out.printf("%-10s %-2s %-5s %-5s %s \n" , "\033[31m│  PROGR │", " SIINF │", " PROGR │ ", "PROGR │", " SIINF │");
    System.out.println("├────────┼────────┼────────┼────────┼────────┤");
    System.out.printf("%-10s %-2s %-5s %-5s %s \n" , "│  PROGR │", " SIINF │", " PROGR │ ", "PROGR │", " SIINF │");
    System.out.println("├────────┼────────┼────────┼────────┼────────┤");
    System.out.printf("%-10s %-2s %-5s %-5s %s \n" , "│  BADAT │", " SIINF │", " BADAT │ ", "PROGR │", " SIINF │");
    System.out.println("├────────┼────────┼────────┼────────┼────────┤");
    System.out.printf("%-10s %-2s %-5s %-5s %s \n" , "│  BADAT │", " PROGR │", " ENDES │ ", "BADAT │", "  FOL  │");
    System.out.println("├────────┼────────┼────────┼────────┼────────┤");
    System.out.printf("%-10s %-2s %-5s %-5s %s \n" , "│  LMSGI │", " LMSGI │", " ENDES │ ", "BADAT │", "  FOL  │");
    System.out.println("├────────┼────────┼────────┼────────┼────────┤");
    System.out.printf("%-10s %-2s %-5s %-5s %s \n" , "│  LMSGI │", " LMSGI │", " ENDES │ ", "BADAT │", "  FOL  │");
    System.out.println("└────────┴────────┴────────┴────────┴────────┘");

  }                     
}
