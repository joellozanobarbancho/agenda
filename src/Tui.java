import java.util.Scanner;

public class Tui {
    Scanner sc = new Scanner(System.in);

    int showOptions() {
        System.out.println("""
                Welcome to the agenda, please choose an option:
                1. Create a new contact.
                2. Search for existing contacts.
                3. Update an existing contact.
                4. Delete an existing contact.
                5. Exit.""");
        int option = sc.nextInt();
        System.out.println("You selected the option to " + switch (option) {
            case 1 -> "create new contact\n";
            case 2 -> "search for existing contact\n";
            case 3 -> "update an existing contact\n";
            case 4 -> "delete an existing contact\n";
            case 5 -> "exit\n";
            default -> "do nothing\n";
        });
        return option;
    }

    String[] newContact() {
        String[] s = new String[4];
        System.out.println("Insert contact's name:");
        s[0] = sc.next();
        System.out.println("Insert contact's surname: ");
        s[1] = sc.next();
        System.out.println("Insert contact's phone:");
        s[2] = sc.next();
        System.out.println("Insert contact's email:");
        s[3] = sc.next();
        return s;
    }

    int chooseSearchOption() {
        System.out.println("""
                Choose a search option:
                1. Show all.
                2. Search by name.
                3. Search by surname.
                4. Search by phone.
                5. Search by email.
                6. Back.""");
        return sc.nextInt();
    }

    String toSearch() {
        System.out.println("Insert contact's data:");
        return this.sc.next();
    }

    int toSearchId(){
        System.out.println("Insert contact's ID:");
        return this.sc.nextInt();
    }

    void println(Object data){
        System.out.println(data);
    }
}
