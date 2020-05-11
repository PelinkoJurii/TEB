import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstValue;
        float secondValue;
        String inputText;


        System.out.println("Podaj liczbe calkowita: ");
        firstValue = scanner.nextInt();

        System.out.println("Podaj liczbe zmiennoprzecinkowa: ");
        secondValue = scanner.nextFloat();

        System.out.println("Pierwsza liczba to: "+firstValue);
        System.out.println("Druga liczba to: "+secondValue);

        System.out.println("Podaj słowo: ");
        inputText = scanner.next();
        System.out.println("Podałeś: " + inputText);

    }
}