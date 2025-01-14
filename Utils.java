import java.util.Scanner;

public class Utils {
    void searchAll(Contact[] contacts) {
        if (contacts == null) return;
        for (Contact ct : contacts)
            Contact.showContact(ct);
    }
    void searchByName(Scanner sc, Contact[] contacts) {
        if (contacts == null) return;
        System.out.println("Insert contact's name: ");
        String s = sc.next();
        boolean found = false;
        for (Contact ct : contacts) {
            if (ct.name.contains(s)) {
                found = true;
                Contact.showContact(ct);
                break;
            }
        }
        if (!found) System.out.println("Contact not found :(");
    }
    void searchBySurname(Scanner sc, Contact[] contacts) {
        if (contacts == null) return;
        System.out.println("Insert contact's surname: ");
        String s = sc.next();
        boolean found = false;
        for (Contact ct : contacts) {
            if (ct.surname.contains(s)) {
                found = true;
                Contact.showContact(ct);
                break;
            }
        }
        if (!found) System.out.println("Contact not found :(");
    }
    void searchByPhone(Scanner sc, Contact[] contacts) {
        if (contacts == null) return;
        System.out.println("Insert contact's phone: ");
        String s = sc.next();
        boolean found = false;
        for (Contact ct : contacts) {
            if (ct.tel.contains(s)) {
                found = true;
                Contact.showContact(ct);
                break;
            }
        }
        if (!found) System.out.println("Contact not found :(");
    }
        void searchByEmail(Scanner sc, Contact[] contacts) {
            if (contacts == null) return;
            System.out.println("Insert contact's email: ");
        String s = sc.next();
            boolean found = false;
            for (Contact ct : contacts) {
                if (ct.email.contains(s)) {
                    found = true;
                    Contact.showContact(ct);
                    break;
                }
            }
            if (!found) System.out.println("Contact not found :(");
        }
}
