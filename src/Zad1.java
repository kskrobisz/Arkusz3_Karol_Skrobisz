import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;

        do {
            System.out.println("Podaj liczbę z przedziału od 10 do 24:");
            liczba = scanner.nextInt();
        } while (liczba < 10 || liczba > 24);

        System.out.println("Poprawna liczba: " + liczba);
        scanner.close();
    }
}
