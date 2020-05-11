import java.util.Scanner;
public class main1_scan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String imie;
        String nazwisko;
        int wiek;
        int wzrost;
        int waga;
        int liczbaA;
        int liczbaB;
        int summa;
        int roznica;
        System.out.println("Imie: ");
         imie = scanner.next();

        System.out.println("Nazwisko: " );
        nazwisko = scanner.next();


        System.out.println("Wiek: " );
        wiek = scanner.nextInt();

        System.out.println("Wzrost: " );
        wzrost = scanner.nextInt();

        System.out.println("Waga: " );
        waga = scanner.nextInt();

        System.out.println("LiczbaA: " );
        liczbaA = scanner.nextInt();

        System.out.println("LiczbaB: " );
        liczbaB = scanner.nextInt();

        System.out.printf("Nazywasz się " + "%s " +"%s " +", masz " +"%d " +" lat, masz " +"%d " +"cm wzrostu oraz ważysz " +" %d" +" kg \n", imie, nazwisko, wiek, wzrost, waga);


        summa = liczbaA + liczbaB;
        System.out.printf( "Summa: %d \n" , summa );


        roznica = liczbaA - liczbaB;
        System.out.printf( "Roznica: %d " , roznica );



    }
}
