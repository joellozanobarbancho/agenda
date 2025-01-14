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
            case 1 -> "create new contact\n";
            case 2 -> "search for existing contact\n";
            case 3 -> "update an existing contact\n";
            case 4 -> "delete an existing contact\n";
            case 5 -> "exit\n";
            default -> "do nothing\n";
        });
    }
}
