import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String odpowiedz;

        do {
            System.out.println("Czy chcesz kontynuować? (Tak/Nie):");
            odpowiedz = scanner.nextLine();
        } while (!odpowiedz.equalsIgnoreCase("Tak") && !odpowiedz.equalsIgnoreCase("Nie"));

        System.out.println("Odpowiedź: " + odpowiedz);
        scanner.close();
    }
}
