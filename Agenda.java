import java.util.Scanner;

public class Agenda {
    Contact[] contacts = new Contact[100];
    int id = 0;
    void showContact(Contact c) {
        if (c == null) return;
        System.out.println(
                "ID: " + c.id +
                        "\nNAME: " + c.name +
                        "\nSURNAME: " + c.surname +
                        "\nTEL: " + c.tel +
                        "\nEMAIL: " + c.email
        );
        System.out.println();
    }
    void createContact(Scanner sc) {
        if (sc == null) return;
        System.out.println("Insert new contact's name:");
        String name = sc.next();
        System.out.println("Insert contact's surname: ");
        String surname = sc.next();
        System.out.println("Insert contact's phone:");
        String tel = sc.next();
        System.out.println("Insert contact's email:");
        String email = sc.next();
        this.contacts[this.id] = new Contact(this.id, name, surname, tel, email);
        System.out.println("\nNew contact created!\n");
        showContact(this.contacts[this.id]);
    }
    void searchContact(Scanner sc) {
        if (sc == null) return;
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
            case 1 -> searchAll();
            case 2 -> searchByName(sc);
            case 3 -> searchBySurname(sc);
            case 4 -> searchByPhone(sc);
            case 5 -> searchByEmail(sc);
            //default -> go back;
        }
    }
    void updateContact(Scanner sc) {
        if (sc == null) return;
        System.out.println("Insert contact's ID:");
        int id = sc.nextInt();
        if (id < this.id) createContact(sc);
        else System.out.println("Error: Invalid ID\n");
        System.out.println('\n');
    }
    void deleteContact(Scanner sc) {
        if (sc == null) return;
        System.out.println("Insert contact's ID:");
        int id = sc.nextInt();
        if (id < this.id) {
            this.contacts[this.id] = null;
            System.out.println("Contact deleted!\n");
        }
        else System.out.println("Error: Invalid ID\n");
    }

    private void searchAll() {
        for (Contact ct : this.contacts)
            this.showContact(ct);
    }
    private void searchByName(Scanner sc) {
        if (sc == null) return;
        System.out.println("Insert contact's name: ");
        String s = sc.next();
        boolean found = false;
        for (Contact ct : this.contacts) {
            if (ct.name.contains(s)) {
                found = true;
                this.showContact(ct);
                break;
            }
        }
        if (!found) System.out.println("Contact not found :(");
    }
    private void searchBySurname(Scanner sc) {
        if (sc == null) return;
        System.out.println("Insert contact's name: ");
        String s = sc.next();
        boolean found = false;
        for (Contact ct : this.contacts) {
            if (ct.surname.contains(s)) {
                found = true;
                this.showContact(ct);
                break;
            }
        }
        if (!found) System.out.println("Contact not found :(");
    }
    private void searchByPhone(Scanner sc) {
        if (sc == null) return;
        System.out.println("Insert contact's name: ");
        String s = sc.next();
        boolean found = false;
        for (Contact ct : this.contacts) {
            if (ct.tel.contains(s)) {
                found = true;
                this.showContact(ct);
                break;
            }
        }if (!found) System.out.println("Contact not found :(");
    }
    private void searchByEmail(Scanner sc) {
        if (sc == null) return;
        System.out.println("Insert contact's name: ");
        String s = sc.next();
        boolean found = false;
        for (Contact ct : this.contacts) {
            if (ct.email.contains(s)) {
                found = true;
                this.showContact(ct);
                break;
            }
        }
        if (!found) System.out.println("Contact not found :(");
    }
}

