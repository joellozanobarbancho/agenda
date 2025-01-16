import java.util.Scanner;

public class Agenda {
    Scanner sc;
    Contact[] contacts = new Contact[100];
    int id = 0;

    Agenda(Scanner sc) {
        this.sc = sc;
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
        this.contacts[this.id] = new Contact(this.id, name, surname, tel, email);
        System.out.println("\nNew contact created!\n");
        System.out.println(this.contacts[this.id++]);
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
        if (id >= this.id || id < 0) {
            System.out.println("\nError: Invalid ID\n");
            return;
        }
        Contact c = this.contacts[id];
        System.out.println("Insert contact's name:");
        c.setName(this.sc.next());
        System.out.println("Insert contact's surname: ");
        c.setSurname(this.sc.next());
        System.out.println("Insert contact's phone:");
        c.setTel(this.sc.next());
        System.out.println("Insert contact's email:");
        c.setEmail(this.sc.next());
        System.out.println("\nContact updated!\n");
        System.out.println(this.contacts[id]);
    }

    void deleteContact() {
        System.out.println("Insert contact's ID:");
        int id = this.sc.nextInt();
        if (id >= this.id || id < 0) {
            System.out.println("\nError: Invalid ID\n");
            return;
        }
        this.contacts[id] = null;
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
        for (int i = 0; i < this.id; i++) {
            if (this.contacts[i] == null) continue;
            System.out.println(this.contacts[i]);
        }
    }

    private void searchByName() {
        System.out.println("Insert contact's name:");
        String s = this.sc.next();
        for (int i = 0; i < this.id; i++) {
            Contact c = this.contacts[i];
            if (c == null) continue;
            if (c.getName().contains(s)) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("\nContact not found :(\n");
    }

    private void searchBySurname() {
        System.out.println("Insert contact's surname:");
        String s = this.sc.next();
        for (int i = 0; i < this.id; i++) {
            Contact c = this.contacts[i];
            if (c == null) continue;
            if (c.getSurname().contains(s)) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("\nContact not found :(\n");
    }

    private void searchByPhone() {
        System.out.println("Insert contact's phone:");
        String s = this.sc.next();
        for (int i = 0; i < this.id; i++) {
            Contact c = this.contacts[i];
            if (c == null) continue;
            if (c.getTel().contains(s)) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("\nContact not found :(\n");
    }

    private void searchByEmail() {
        System.out.println("Insert contact's email:");
        String s = this.sc.next();
        for (int i = 0; i < this.id; i++) {
            Contact c = this.contacts[i];
            if (c == null) continue;
            if (c.getEmail().contains(s)) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("\nContact not found :(\n");
    }
}
