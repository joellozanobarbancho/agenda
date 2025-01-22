import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    Scanner sc;
    ArrayList<Contact> contacts;
    int count = 0;

    Agenda(Scanner sc) {
        this.sc = sc;
        this.contacts = new ArrayList<Contact>();
    }

    void createContact() {
        System.out.println("Insert new contact's name:");
        String name = this.sc.next();
        System.out.println("Insert new contact's surname: ");
        String surname = this.sc.next();
        System.out.println("Insert new contact's phone:");
        String tel = this.sc.next();
        System.out.println("Insert new contact's email:");
        String email = this.sc.next();
        contacts.add(new Contact(this.count, name, surname, tel, email));
        System.out.println("\nNew contact created!\n");
        System.out.println(this.contacts.get(this.count++));
    }

    void searchContact() {
        System.out.println("""
                Choose a search option:
                1. Show all.
                2. Search by name.
                3. Search by surname.
                4. Search by phone.
                5. Search by email.
                6. Back.""");
        switch (this.sc.nextInt()) {
            case 1 -> showAll();
            case 2 -> searchByName();
            case 3 -> searchBySurname();
            case 4 -> searchByPhone();
            case 5 -> searchByEmail();
            //default -> go back;
        }
    }

    void updateContact() {
        System.out.println("Insert contact's ID:");
        int id = this.sc.nextInt();
        Contact ct = searchByID(id);
        if (ct == null) return;
        System.out.println("Insert contact's name:");
        ct.setName(this.sc.next());
        System.out.println("Insert contact's surname: ");
        ct.setSurname(this.sc.next());
        System.out.println("Insert contact's phone:");
        ct.setTel(this.sc.next());
        System.out.println("Insert contact's email:");
        ct.setEmail(this.sc.next());
        System.out.println("\nContact updated!\n");
        System.out.println(ct);
    }

    void deleteContact() {
        System.out.println("Insert contact's ID:");
        int id = this.sc.nextInt();
        if (id >= this.count || id < 0) {
            System.out.println("\nError: Invalid ID\n");
            return;
        }
        this.contacts.remove(searchByID(id));
        this.count--;
        System.out.println("Contact deleted!\n");
    }

    void showMenu() {
        System.out.println("""
                Welcome to the agenda, please choose an option:
                1. Create a new contact.
                2. Search for existing contacts.
                3. Update an existing contact.
                4. Delete an existing contact.
                5. Exit.""");
    }

    void showOption(int input) {
        System.out.println("You selected the option to " + switch (input) {
            case 1 -> "create new contact\n";
            case 2 -> "search for existing contact\n";
            case 3 -> "update an existing contact\n";
            case 4 -> "delete an existing contact\n";
            case 5 -> "exit\n";
            default -> "do nothing\n";
        });
    }

    private void showAll() {
        for (Contact ct : this.contacts) {
            System.out.println(ct);
        }
    }

    private Contact searchByID(int id) {
        for (Contact ct : this.contacts) {
            if (id == ct.getId())
                return ct;
        }
        return null;
    }

    private void searchByName() {
        System.out.println("Insert contact's name:");
        String s = this.sc.next();
        for (Contact ct : this.contacts) {
            if (ct.getName().contains(s)) {
                System.out.println(ct);
                return;
            }
        }
        System.out.println("\nContact not found :(\n");
    }

    private void searchBySurname() {
        System.out.println("Insert contact's surname:");
        String s = this.sc.next();
        for (Contact ct : this.contacts) {
            if (ct.getSurname().contains(s)) {
                System.out.println(ct);
                return;
            }
        }
        System.out.println("\nContact not found :(\n");
    }

    private void searchByPhone() {
        System.out.println("Insert contact's phone:");
        String s = this.sc.next();
        for (Contact ct : this.contacts) {
            if (ct.getTel().contains(s)) {
                System.out.println(ct);
                return;
            }
        }

        System.out.println("\nContact not found :(\n");
    }

    private void searchByEmail() {
        System.out.println("Insert contact's email:");
        String s = this.sc.next();
        for (Contact ct : this.contacts) {
            if (ct.getEmail().contains(s)) {
                System.out.println(ct);
                return;
            }
        }
        System.out.println("\nContact not found :(\n");
    }
}
