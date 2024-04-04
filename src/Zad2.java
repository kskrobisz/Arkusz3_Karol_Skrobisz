import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char litera;

        do {
            System.out.println("Podaj literę 'T', 't', 'N' lub 'n':");
            litera = scanner.next().charAt(0);
        } while (litera != 'T' && litera != 't' && litera != 'N' && litera != 'n');

        System.out.println("Poprawna litera: " + litera);
        scanner.close();
    }
}
