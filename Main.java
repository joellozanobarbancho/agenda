import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Agenda a = new Agenda(sc);
        while (true) {
            a.showMenu();
            int input = sc.nextInt();
            a.showOption(input);
            switch (input) {
                case 1 -> a.createContact();
                case 2 -> a.searchContact();
                case 3 -> a.updateContact();
                case 4 -> a.deleteContact();
                case 5 -> {
                    return;
                }
            }
        }
    }
}