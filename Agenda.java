public class Agenda {
    Contact[] contacts = new Contact[100];
    int id = 0;
    static void showMenu() {
        System.out.println("""
                         Welcome to the agenda, please choose an option:
                         1. Create a new contact.
                         2. Search for existing contacts.
                         3. Update an existing contact.
                         4. Delete an existing contact.
                         5. Exit."""
        );
    }
    static void showOptions(int input) {
        System.out.println(
                "You selected the option to " + switch (input) {
            case 1 -> "create new contact";
            case 2 -> "search for existing contact";
            case 3 -> "update an existing contact";
            case 4 -> "delete an existing contact";
            case 5 -> "exit";
            default -> "do nothing";
        });
    }
}
