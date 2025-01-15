import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static void showMenu() {
        System.out.println("""
                         Welcome to the agenda, please choose an option:
                         1. Create a new contact.
                         2. Search for existing contacts.
                         3. Update an existing contact.
                         4. Delete an existing contact.
                         5. Exit."""
        );
    }
    private static void showOption(int input) {
        System.out.println(
                "You selected the option to " + switch (input) {
                    case 1 -> "create new contact\n";
                    case 2 -> "search for existing contact\n";
                    case 3 -> "update an existing contact\n";
                    case 4 -> "delete an existing contact\n";
                    case 5 -> "exit\n";
                    default -> "do nothing\n";
                });
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Agenda a = new Agenda();
        while (true) {
            showMenu();
            int input = sc.nextInt();
            showOption(input);
            switch (input) {
                case 1 -> a.createContact(sc);
                case 2 -> a.searchContact(sc);
                case 3 -> a.updateContact(sc);
                case 4 -> a.deleteContact(sc);
                case 5 -> {
                    return;
                }
            }
        }
    }
}