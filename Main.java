import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Agenda a = new Agenda();
        while (true) {
            Agenda.showMenu();
            int input = sc.nextInt();
            Agenda.showOptions(input);
            switch (input) {
                case 1 -> Contact.createContact(sc, a.contacts, a.id++);
                case 2 -> Contact.searchContact(sc, a.contacts);
                case 3 -> Contact.updateContact(sc, a.contacts, a.id);
                case 4 -> Contact.deleteContact(sc, a.contacts, a.id);
                case 5 -> {
                    return;
                }
            }
        }
    }
}
