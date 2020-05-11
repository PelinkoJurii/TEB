            /* Creat Iurii Pelinko */


package pl.maniaq;
import java.util.Scanner;


public class matemat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();


        /*Dodawanie */
        System.out.println("Dodawania: " +(a+b+c+d));
        System.out.println("Dodawania_a+b: " +(a+b));
        System.out.println("Dodawania_c+d: " +(c+d));
        System.out.println("Dodawania_a+d: " +(a+d));
        System.out.println(" ");

        /*Odejmowanie */
        System.out.println("Odejmowanie: " +(a-b-c-d));
        System.out.println("Odejmowanie_a-b: " +(a-b));
        System.out.println("Odejmowanie_c-d: " +(c-d));
        System.out.println("Odejmowanie_a-d: " +(a-d));
        System.out.println(" ");

        /* Mnozenie  */

        System.out.println("Mnozenie: " +(a*b*c*d));
        System.out.println("Mnozenie_a*b: " +(a*b));
        System.out.println("Mnozenie_c*d: " +(c*d));
        System.out.println("Mnozenie_a*d: " +(a*d));
        System.out.println(" ");



        /* Dzielenie */

        System.out.println("Dzielenie: " +((float)a/(float)b/(float)c/(float)d));
        System.out.println("Dzielenie_a/b: " +((float)a/(float)b));
        System.out.println("Dzielenie_c/d: " +((float)c/(float)d));
        System.out.println("Dzielenie_a/d: " +((float)a/(float)d));
        System.out.println(" ");
        /*Dzielenie po modulo */

        System.out.println("Dzielenie po modulo: " +((float)a/(float)b/(float)c/(float)d));
        System.out.println("Dzielenie po modulo_a%b: " +((float)a/(float)b));
        System.out.println("Dzielenie po modulo_c%d: " +((float)c/(float)d));
        System.out.println("Dzielenie po modulo_a%d: " +((float)a/(float)d));
        System.out.println(" ");

        /* Sprawdź wynik działania */
        int win_summ = 3 + 5 * 4 - 10 * 2;
        System.out.println("Sprawdź wynik działania: "+win_summ);

        /* Boolean   */
        int licba =scanner.nextInt();
        System.out.println("Podaj licbe: " + licba);
        
    }
}