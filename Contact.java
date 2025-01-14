import java.util.Scanner;

public class Contact {
    int id;
    String name, surname, tel, email;

    public Contact(int id, String name, String surname, String tel, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.tel = tel;
        this.email = email;
    }
    static void showContact(Contact ct) {
        if (ct == null) return;
        System.out.println(
                "ID: " + ct.id +
                "\nNAME: " + ct.name +
                "\nSURNAME: " + ct.surname +
                "\nTEL: " + ct.tel +
                "\nEMAIL: " + ct.email
        );
    }
    static void createContact(Scanner sc, Contact[] contacts, int i) {
        if (contacts == null) return;
        System.out.println("Insert new contact's name: ");
        String name = sc.next();
        System.out.println("Insert contact's surname: ");
        String surname = sc.next();
        System.out.println("Insert contact's phone: ");
        String tel = sc.next();
        System.out.println("Insert contact's email: ");
        String email = sc.next();
        contacts[i] = new Contact(i, name, surname, tel, email);
        System.out.println("New contact created!");
        Contact.showContact(contacts[i]);
    }
    static void searchContact(Scanner sc, Contact[] contacts) {
        if (contacts == null) return;
        Utils u = new Utils();
        System.out.println("""
                Choose a search option:
                1. Search all.
                2. Search by name.
                3. Search by surname.
                4. Search by phone.
                5. Search by email.
                6. Back."""
        );
        switch (sc.nextInt()) {
            case 1 -> u.searchAll(contacts);
            case 2 -> u.searchByName(sc, contacts);
            case 3 -> u.searchBySurname(sc, contacts);
            case 4 -> u.searchByPhone(sc, contacts);
            case 5 -> u.searchByEmail(sc, contacts);
            //default -> go back;
        }
    }
    static void updateContact(Scanner sc, Contact[] contacts, int len) {
        if (contacts == null) return;
        System.out.println("Insert contact's ID: ");
        int id = sc.nextInt();
        if (id < len) createContact(sc, contacts, id);
        else System.out.println("Error: Invalid ID");
    }
    static void deleteContact(Scanner sc, Contact[] contacts, int len) {
        if (contacts == null) return;
        System.out.println("Insert contact's ID: ");
        int id = sc.nextInt();
        if (id < len) {
            contacts[id] = null;
            System.out.println("Contact deleted!");
        }
        else System.out.println("Error: Invalid ID");
    }
}
